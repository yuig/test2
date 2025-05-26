package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import okhttp3.OkHttpClient;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule {
    public final void a(Context context, b bVar, j jVar) {
        if (md.b.f86952b == null) {
            synchronized (md.b.class) {
                try {
                    if (md.b.f86952b == null) {
                        md.b.f86952b = new OkHttpClient();
                    }
                } finally {
                }
            }
        }
        jVar.i(new md.b(md.b.f86952b));
    }
}
