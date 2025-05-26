package ac;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import ao2.g2;
import ao2.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class f extends dl2.j implements Function1 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ n B;

    /* renamed from: r, reason: collision with root package name */
    public int f1802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f1803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1804t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1805u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1806v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f1807w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.h f1808x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f1809y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f1810z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, int i13, int i14, boolean z13, float f13, com.airbnb.lottie.h hVar, float f14, boolean z14, boolean z15, n nVar, bl2.c cVar) {
        super(1, cVar);
        this.f1803s = jVar;
        this.f1804t = i13;
        this.f1805u = i14;
        this.f1806v = z13;
        this.f1807w = f13;
        this.f1808x = hVar;
        this.f1809y = f14;
        this.f1810z = z14;
        this.A = z15;
        this.B = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new f(this.f1803s, this.f1804t, this.f1805u, this.f1806v, this.f1807w, this.f1808x, this.f1809y, this.f1810z, this.A, this.B, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f1802r;
        j jVar = this.f1803s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                jVar.f(this.f1804t);
                int i14 = this.f1805u;
                jVar.f1823c.setValue(Integer.valueOf(i14));
                jVar.f1824d.setValue(Boolean.valueOf(this.f1806v));
                float f13 = this.f1807w;
                jVar.f1826f.setValue(Float.valueOf(f13));
                jVar.f1825e.setValue(null);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = jVar.f1829i;
                com.airbnb.lottie.h hVar = this.f1808x;
                parcelableSnapshotMutableState.setValue(hVar);
                jVar.g(this.f1809y);
                jVar.f1827g.setValue(Boolean.valueOf(this.f1810z));
                if (!this.A) {
                    jVar.f1832l.setValue(Long.MIN_VALUE);
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = jVar.f1821a;
                if (hVar == null) {
                    parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                    return Unit.f80348a;
                }
                if (Float.isInfinite(f13)) {
                    jVar.g(jVar.d());
                    parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                    jVar.f(i14);
                    return Unit.f80348a;
                }
                parcelableSnapshotMutableState2.setValue(Boolean.TRUE);
                int i15 = e.f1801a[this.B.ordinal()];
                if (i15 == 1) {
                    coroutineContext = g2.f20157b;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coroutineContext = kotlin.coroutines.j.f80412a;
                }
                d dVar = new d(this.B, m0.z(getContext()), this.f1805u, this.f1804t, this.f1803s, null);
                this.f1802r = 1;
                if (kotlin.jvm.internal.j.M(this, coroutineContext, dVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m0.t(getContext());
            j.c(jVar, false);
            return Unit.f80348a;
        } catch (Throwable th3) {
            j.c(jVar, false);
            throw th3;
        }
    }
}
