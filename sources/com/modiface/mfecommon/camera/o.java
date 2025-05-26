package com.modiface.mfecommon.camera;

import android.graphics.Bitmap;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.a;
import com.modiface.mfecommon.camera.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class o implements d.InterfaceC0001d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.h f34241a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34242b;

    public o(a aVar, a.h hVar) {
        this.f34242b = aVar;
        this.f34241a = hVar;
    }

    @Override // com.modiface.mfecommon.camera.d.InterfaceC0001d
    public void a(Bitmap bitmap, @NonNull b bVar) {
        AtomicBoolean atomicBoolean;
        com.modiface.mfecommon.mfea.d dVar;
        if (bitmap != null) {
            Bitmap a13 = com.modiface.mfecommon.utils.h.a(bVar.d() ? bitmap.getHeight() : bitmap.getWidth(), bVar.d() ? bitmap.getWidth() : bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            dVar = this.f34242b.f34177l;
            dVar.g(bitmap, a13, bVar.b());
            this.f34241a.a(a13, null);
        } else {
            this.f34241a.a(null, new NullPointerException("failed to take picture, the returned picture is null"));
        }
        atomicBoolean = this.f34242b.f34171f;
        if (atomicBoolean.get()) {
            return;
        }
        com.modiface.mfecommon.utils.h.a(new n(this));
    }

    @Override // com.modiface.mfecommon.camera.d.InterfaceC0001d
    public void a(@NonNull Camera.Parameters parameters) {
        this.f34241a.a(parameters);
    }
}
