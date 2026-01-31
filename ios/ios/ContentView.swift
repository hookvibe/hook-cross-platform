//
//  ContentView.swift
//  ios
//
//  Created by 高睿诚 on 2026/1/30.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        ZStack {
            LinearGradient(
                colors: [Color.hcpBackgroundStart, Color.hcpBackgroundEnd],
                startPoint: .topLeading,
                endPoint: .bottomTrailing
            )
            .ignoresSafeArea()

            VStack(spacing: 0) {
                Text("hook-cross-platform")
                    .font(.system(size: 12, weight: .semibold))
                    .kerning(3.4)
                    .textCase(.uppercase)
                    .foregroundStyle(Color.hcpAccent)
                    .padding(.bottom, 12)

                Text("Hello HCP")
                    .font(.system(size: 28, weight: .bold))
                    .foregroundStyle(Color.hcpTitle)
                    .padding(.bottom, 8)

                Text("跨端一致 Demo")
                    .font(.system(size: 16))
                    .foregroundStyle(Color.hcpSubtitle)

                RoundedRectangle(cornerRadius: 999, style: .continuous)
                    .fill(Color.hcpAccent)
                    .frame(width: 72, height: 3)
                    .padding(.top, 16)
                    .padding(.bottom, 12)

                Text("TS / Kotlin / SwiftUI")
                    .font(.system(size: 13))
                    .foregroundStyle(Color.hcpMeta)
            }
            .multilineTextAlignment(.center)
            .padding(.top, 28)
            .padding(.horizontal, 28)
            .padding(.bottom, 30)
            .frame(maxWidth: 360)
            .background(Color.white.opacity(0.92))
            .clipShape(RoundedRectangle(cornerRadius: 20, style: .continuous))
            .shadow(color: Color.hcpShadow, radius: 20, x: 0, y: 18)
            .padding(24)
        }
    }
}

#Preview {
    ContentView()
}

private extension Color {
    static let hcpBackgroundStart = Color(red: 15.0 / 255.0, green: 23.0 / 255.0, blue: 42.0 / 255.0)
    static let hcpBackgroundEnd = Color(red: 30.0 / 255.0, green: 41.0 / 255.0, blue: 59.0 / 255.0)
    static let hcpTitle = Color(red: 15.0 / 255.0, green: 23.0 / 255.0, blue: 42.0 / 255.0)
    static let hcpSubtitle = Color(red: 51.0 / 255.0, green: 65.0 / 255.0, blue: 85.0 / 255.0)
    static let hcpMeta = Color(red: 100.0 / 255.0, green: 116.0 / 255.0, blue: 139.0 / 255.0)
    static let hcpAccent = Color(red: 56.0 / 255.0, green: 189.0 / 255.0, blue: 248.0 / 255.0)
    static let hcpShadow = Color(red: 15.0 / 255.0, green: 23.0 / 255.0, blue: 42.0 / 255.0).opacity(0.35)
}
