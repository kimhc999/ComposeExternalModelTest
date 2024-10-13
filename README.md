`:external` 모듈에 `compose runtime`을 참조하기 전

:app/build/ccompose_compiler/app_debug-classes.txt
```
stable class MainActivity {
  <runtime stability> = Stable
}
stable class InternalTestModel {
  stable val title: String
  stable val message: String
  <runtime stability> = Stable
}
unstable class MainState {
  stable val internalModel: InternalTestModel
  unstable val externalTestModel: ExternalTestModel
  <runtime stability> = Unstable
}
```

---

`:external` 모듈에 `compose runtime` 참조를 추가한 후

:app/build/ccompose_compiler/app_debug-classes.txt
```
stable class MainActivity {
  <runtime stability> = Stable
}
stable class InternalTestModel {
  stable val title: String
  stable val message: String
  <runtime stability> = Stable
}
runtime class MainState {
  stable val internalModel: InternalTestModel
  runtime val externalTestModel: ExternalTestModel
  <runtime stability> = Runtime(ExternalTestModel)
}
```

:external/build/ccompose_compiler/app_debug-classes.txt
```
stable class ExternalTestModel {
  stable val title: String
  stable val message: String
  <runtime stability> = Stable
}
```