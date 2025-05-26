package k81;

import kotlin.jvm.internal.Intrinsics;
import zd1.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f78592b;

    public /* synthetic */ a(l lVar, int i13) {
        this.f78591a = i13;
        this.f78592b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ca2.e eVar;
        int i13 = this.f78591a;
        l this$0 = this.f78592b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((j81.c) this$0.A0.getValue()).n();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    i81.d dVar = (i81.d) this$0.getView();
                    boolean z13 = this$0.f78622h0;
                    p filterSource = this$0.f78624i0;
                    l81.l lVar = (l81.l) dVar;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(filterSource, "filterSource");
                    da2.g gVar = lVar.f82179q1;
                    if (gVar != null) {
                        gVar.c(z13, filterSource);
                        break;
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.g4();
                    this$0.H3();
                    this$0.f4();
                    if (!this$0.f78621h) {
                        this$0.I3();
                        break;
                    }
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.g4();
                    this$0.H3();
                    this$0.f4();
                    this$0.I3();
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i81.d dVar2 = (i81.d) this$0.getViewIfBound();
                if (dVar2 != null && (eVar = ((l81.l) dVar2).f82176o2) != null) {
                    eVar.s("header_tapped", true);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.G3();
                    break;
                }
                break;
        }
    }
}
