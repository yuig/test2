package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17246a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f17247b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f17248c = tb.f.X(-1);

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f17249d = tb.f.X(0);

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17250e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17251f;

    public h0(Object obj, i0 i0Var) {
        this.f17246a = obj;
        this.f17247b = i0Var;
        y3 y3Var = y3.f71400a;
        this.f17250e = bs1.c.u1(null, y3Var);
        this.f17251f = bs1.c.u1(null, y3Var);
    }

    public final h0 a() {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f17249d;
        if (parcelableSnapshotMutableIntState.h() == 0) {
            this.f17247b.f17253a.add(this);
            h0 h0Var = (h0) this.f17251f.getValue();
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.f17250e.setValue(h0Var);
        }
        parcelableSnapshotMutableIntState.i(parcelableSnapshotMutableIntState.h() + 1);
        return this;
    }

    public final void b() {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f17249d;
        if (parcelableSnapshotMutableIntState.h() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        parcelableSnapshotMutableIntState.i(parcelableSnapshotMutableIntState.h() - 1);
        if (parcelableSnapshotMutableIntState.h() == 0) {
            this.f17247b.f17253a.remove(this);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f17250e;
            h0 h0Var = (h0) parcelableSnapshotMutableState.getValue();
            if (h0Var != null) {
                h0Var.b();
            }
            parcelableSnapshotMutableState.setValue(null);
        }
    }
}
