package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    protected AtomicReference<a> f34293a = new AtomicReference<>(null);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Bitmap> f34294a;

        /* renamed from: b, reason: collision with root package name */
        public final o f34295b;

        public a(ConcurrentLinkedQueue<Bitmap> concurrentLinkedQueue, o oVar) {
            this.f34294a = concurrentLinkedQueue;
            this.f34295b = oVar;
        }
    }

    public void a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("bitmap to add to MFEFixedSizeBitmapCache must not be <code>null</code> nor recycled and must have config ARGB_8888");
        }
        a aVar = this.f34293a.get();
        if (aVar == null || !aVar.f34295b.a(bitmap.getWidth(), bitmap.getHeight())) {
            aVar = new a(new ConcurrentLinkedQueue(), new o(bitmap.getWidth(), bitmap.getHeight()));
            this.f34293a.set(aVar);
        }
        aVar.f34294a.add(bitmap);
    }

    public Bitmap a() {
        a aVar = this.f34293a.get();
        if (aVar != null) {
            return aVar.f34294a.poll();
        }
        return null;
    }
}
