package j4;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.q1;

/* loaded from: classes3.dex */
public final class g extends h6.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f74581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f74582b;

    public g(ParcelableSnapshotMutableState parcelableSnapshotMutableState, h hVar) {
        this.f74581a = parcelableSnapshotMutableState;
        this.f74582b = hVar;
    }

    @Override // h6.j
    public final void a() {
        this.f74582b.f74583a = k.f74586a;
    }

    @Override // h6.j
    public final void b() {
        this.f74581a.setValue(Boolean.TRUE);
        this.f74582b.f74583a = new l(true);
    }
}
