# hook-cross-platform

一个用于对齐 Web、Android、iOS 三端视觉的跨端原生 Demo。当前每端只保留一个 Hello 页面，但三端 UI 设计一致，便于后续扩展为完整的原生项目。

## 目录结构
- `web/`：TypeScript + React（Vite）
- `android/`：Kotlin + XML（Material Components）
- `ios/`：SwiftUI（Swift）

## 统一 UI 规范
- 背景：#0F172A → #1E293B 线性渐变（左上到右下）
- 卡片：白色 92% 透明，圆角 20px，阴影 0 18px 40px 透明黑
- 强调色：#38BDF8
- 文本：标题 28px，副标题 16px，说明 13px
