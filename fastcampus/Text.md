# Compose Text의 기본 사용법

### 스텝 1: 색상 지정하기
```kotlin
Text(color = Color.Red, text = "Hello $name")
```
### 스텝 2: Color 객체를 이용해서 해쉬값으로 색상을 전달해봅시다. (ARGB 순)
```kotlin
Text(color = Color(0xfff999bb), text = "Hello $name")
```
### 스텝 3: fontSize 파라미터에 30.sp를 전달해봅니다.
```kotlin
Text(text = "Hello $name", fontSize = 30.sp)
```
### 스텝 4: fontWeight에 FontWeight.Bold를 전달해봅시다.
```kotlin
Text(text = "Hello $name",fontWeight = FontWeight.Bold)
```
### 스텝 5: fontFamily에 FontFamily.Cursive를 전달해봅시다.
```kotlin
Text(text = "Hello $name",fontFamily = FontFamily.Cursive)
```
### 스텝 6: letterSpacing에 2.sp를 지정해봅시다.
```kotlin
Text(color = text = "Hello $name",letterSpacing = 2.sp)
``` 
### 스텝 7: maxLines를 2로 지정하고 문자열을 더 추가해봅시다.
```kotlin
Text(text = "Hello $name\nHello $name\nHello $name",maxLines = 2)
```
### 스텝 8: textDecoration에 TextDecoration.Underline을 추가합시다.
```kotlin
Text(text = "Hello $name\nHello $name\nHello $name",textDecoration = TextDecoration.Underline)
```
### 스텝 9: textAlign을 TextAlign.Center로 지정합니다.
```kotlin
Text(modifier = Modifier.size(300.dp),text = "Hello $name\nHello $name\nHello $name",textAlign = TextAlign.Center)
```
```txt
 modifier = Modifier.size(300.dp) 해당 부분은 프리뷰상에서 Text의 크기에 맞게 나오기 때문에 강제로 프리뷰 사이즈를 300dp 넣어준거 입니다.
 width = 가로 크기
 height = 세로 크기
```

