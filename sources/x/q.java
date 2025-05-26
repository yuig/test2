package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.j1;

/* loaded from: classes2.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final List f131257a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession.StateCallback f131258b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f131259c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131260d;

    /* renamed from: e, reason: collision with root package name */
    public g f131261e = null;

    public q(int i13, ArrayList arrayList, Executor executor, j1 j1Var) {
        this.f131260d = i13;
        this.f131257a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f131258b = j1Var;
        this.f131259c = executor;
    }

    @Override // x.r
    public final List a() {
        return this.f131257a;
    }

    @Override // x.r
    public final void b(g gVar) {
        if (this.f131260d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.f131261e = gVar;
    }

    @Override // x.r
    public final Object c() {
        return null;
    }

    @Override // x.r
    public final g d() {
        return this.f131261e;
    }

    @Override // x.r
    public final Executor e() {
        return this.f131259c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (Objects.equals(this.f131261e, qVar.f131261e) && this.f131260d == qVar.f131260d) {
                List list = this.f131257a;
                int size = list.size();
                List list2 = qVar.f131257a;
                if (size == list2.size()) {
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!((h) list.get(i13)).equals(list2.get(i13))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x.r
    public final int f() {
        return this.f131260d;
    }

    @Override // x.r
    public final CameraCaptureSession.StateCallback g() {
        return this.f131258b;
    }

    @Override // x.r
    public final void h(CaptureRequest captureRequest) {
    }

    public final int hashCode() {
        int hashCode = this.f131257a.hashCode() ^ 31;
        int i13 = (hashCode << 5) - hashCode;
        g gVar = this.f131261e;
        int hashCode2 = (gVar == null ? 0 : gVar.f131247a.hashCode()) ^ i13;
        return this.f131260d ^ ((hashCode2 << 5) - hashCode2);
    }
}
