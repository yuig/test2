package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri, 1);
        this.f29794e = i13;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f29794e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void d(Object obj) {
        switch (this.f29794e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object g(ContentResolver contentResolver, Uri uri) {
        switch (this.f29794e) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor;
                }
                throw new FileNotFoundException(a.c.g("FileDescriptor is null for: ", uri));
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(a.c.g("FileDescriptor is null for: ", uri));
        }
    }
}
