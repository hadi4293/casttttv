# Casttttv

اپ اندروید Kotlin ساخته‌شده توسط GitHub Omni Agent.

## بیلد محلی
```bash
./gradlew assembleRelease
```

## بیلد با GitHub Actions
Workflow `android-build.yml` با هر push به main یا با `workflow_dispatch` یک APK می‌سازد.
با تگ `v*` هم Release + APK منتشر می‌شود.

Package: `com.example.casttttv`
