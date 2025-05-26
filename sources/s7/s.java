package s7;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class s implements j {

    /* renamed from: a, reason: collision with root package name */
    public final DrmSession$DrmSessionException f111331a;

    public s(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.f111331a = drmSession$DrmSessionException;
    }

    @Override // s7.j
    public final DrmSession$DrmSessionException a() {
        return this.f111331a;
    }

    @Override // s7.j
    public final UUID b() {
        return a7.i.f1066a;
    }

    @Override // s7.j
    public final void c(m mVar) {
    }

    @Override // s7.j
    public final boolean d() {
        return false;
    }

    @Override // s7.j
    public final k7.a e() {
        return null;
    }

    @Override // s7.j
    public final void f(m mVar) {
    }

    @Override // s7.j
    public final boolean g(String str) {
        return false;
    }

    @Override // s7.j
    public final int getState() {
        return 1;
    }
}
