package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class k extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i13) {
        super(assetManager, str, 0);
        this.f29810e = i13;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f29810e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void d(Object obj) {
        switch (this.f29810e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Closeable f(AssetManager assetManager, String str) {
        switch (this.f29810e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
