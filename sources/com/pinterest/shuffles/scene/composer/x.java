package com.pinterest.shuffles.scene.composer;

import android.view.TextureView;

/* loaded from: classes4.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f52168b;

    public /* synthetic */ x(TextureView textureView, y yVar, int i13) {
        this.f52167a = i13;
        this.f52168b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f52167a;
        y yVar = this.f52168b;
        switch (i13) {
            case 0:
                yVar.n();
                break;
            default:
                yVar.n();
                break;
        }
    }
}
