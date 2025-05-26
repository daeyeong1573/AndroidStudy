
### 📦 Compose Button 예제 - 단계별 완성하기

---

#### ✅ 스탭 1: 기본 버튼 만들기

가장 기본적인 버튼을 생성합니다. 버튼을 클릭하면 `onClick`에 지정된 동작이 실행됩니다.

```kotlin
Button(onClick = onClick) {
    Text(text = "Send")
}
```

---

#### ✅ 스탭 2: 아이콘 추가

버튼 내 텍스트 앞에 아이콘을 추가합니다.  
`Icons.Filled.Send`가 정상 동작하지 않아, 리소스로 다운로드한 이미지 벡터를 사용하고 `painterResource()`로 처리합니다.  
`contentDescription`해당 코드는 해당 버튼이 어떤 역할을 하는지 적는 공간입니다.

```kotlin
Button(onClick = onClick) {
    androidx.compose.material3.Icon(
        painter = painterResource(R.drawable.baseline_send_24),
        contentDescription = null
    )
    Text(text = "Send")
}
```

---

#### ✅ 스탭 3: 아이콘과 텍스트 사이 여백 추가

아이콘과 텍스트 사이에 `Spacer`를 사용해 간격을 줍니다.  
`Modifier.size(ButtonDefaults.IconSpacing)`를 사용하면 Material Design에서 권장하는 기본 아이콘 간격이 적용됩니다.

```kotlin
Button(onClick = onClick) {
    androidx.compose.material3.Icon(
        painter = painterResource(R.drawable.baseline_send_24),
        contentDescription = null
    )
    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Send")
}
```

---

#### ✅ 스탭 4: 버튼 비활성화

`enabled = false`를 설정하면 버튼이 비활성화되며, 클릭해도 아무런 반응이 없습니다.  
UI적으로도 흐릿하게 표시되어 사용자에게 비활성 상태임을 알려줍니다.

```kotlin
Button(onClick = onClick, enabled = false) {
    androidx.compose.material3.Icon(
        painter = painterResource(R.drawable.baseline_send_24),
        contentDescription = null
    )
    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Send")
}
```

---

#### ✅ 스탭 5: 테두리(Border) 추가

버튼 외곽에 굵기 `10.dp`, 색상 `Color.Magenta`의 테두리를 추가합니다.  
`BorderStroke` 클래스를 사용하여 테두리의 두께와 색상을 지정할 수 있습니다.

```kotlin
Button(
    onClick = onClick,
    enabled = true,
    border = BorderStroke(10.dp, Color.Magenta)
) {
    androidx.compose.material3.Icon(
        painter = painterResource(R.drawable.baseline_send_24),
        contentDescription = null
    )
    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Send")
}
```

---

#### ✅ 스탭 6: 버튼 모양 변경 (원형)

기본적으로 버튼은 라운드 사각형이지만, `shape = CircleShape`를 지정하면 완전한 원형 버튼으로 바뀝니다.  
내용물 크기에 따라 원형이 자동으로 조정됩니다.

```kotlin
Button(
    onClick = onClick,
    border = BorderStroke(10.dp, Color.Magenta),
    shape = CircleShape
) {
    androidx.compose.material3.Icon(
        painter = painterResource(R.drawable.baseline_send_24),
        contentDescription = null
    )
    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Send")
}
```

---

#### ✅ 스탭 7: 내부 여백(contentPadding) 조절

`contentPadding`은 버튼 내부의 패딩(여백)을 의미합니다.  
`PaddingValues(all = 20.dp)`로 설정하여 모든 방향에 20dp의 여백을 줍니다.  
이 설정을 통해 버튼 안의 내용이 가장자리에 너무 붙지 않게 여유를 줄 수 있습니다.

```kotlin
Button(
    onClick = onClick,
    border = BorderStroke(10.dp, Color.Magenta),
    shape = CircleShape,
    contentPadding = PaddingValues(all = 20.dp)
) {
    androidx.compose.material3.Icon(
        painter = painterResource(R.drawable.baseline_send_24),
        contentDescription = null
    )
    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Send")
}
```
