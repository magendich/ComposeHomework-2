# Домашнее задание по Compose №2

### Написать кастомный Layout

1. Нужно создать кастомный Layout, который будет работать как Grid. Функция должна принимать аргумент columns - количество колонок. 

```
@Composable
fun CustomLayoutHW(
    columns: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = { }
)
```

Располагать элементы нужно в порядке построчно. Например, если у нас 7 элементов и 3 колонки, то:

```
[ 1 ] [ 2 ] [ 3 ]
[ 4 ] [ 5 ] [ 6 ]
[ 7 ]
```

2. Сделать скриншот и приложить к Pull Request.

### Начальное и конечное состояние

| Исходное состояние  | К чему надо прийти |
| ------------- | ------------- |
| <img src="https://github.com/Otus-Android/ComposeHomework-2/blob/master/img/start.png?raw=true" width="300">  | <img src="https://github.com/Otus-Android/ComposeHomework-2/blob/master/img/finish.png?raw=true" width="300">  |


