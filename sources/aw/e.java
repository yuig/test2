package aw;

import wi.c0;

/* loaded from: classes3.dex */
public final class e implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yv.g f20535b;

    public /* synthetic */ e(yv.g gVar, int i13) {
        this.f20534a = i13;
        this.f20535b = gVar;
    }

    @Override // wi.c0
    public final void onVideoEnd() {
        int i13 = this.f20534a;
        yv.g gVar = this.f20535b;
        switch (i13) {
            case 0:
                ((f) gVar).j().B3();
                break;
            default:
                int i14 = cw.e.f53321w;
                ((cw.e) gVar).j().B3();
                break;
        }
    }

    @Override // wi.c0
    public final void onVideoPause() {
    }

    @Override // wi.c0
    public final void onVideoPlay() {
        int i13 = this.f20534a;
        yv.g gVar = this.f20535b;
        switch (i13) {
            case 0:
                ((f) gVar).j().x3();
                break;
            default:
                int i14 = cw.e.f53321w;
                ((cw.e) gVar).j().x3();
                break;
        }
    }

    @Override // wi.c0
    public final void onVideoStart() {
        int i13 = this.f20534a;
        yv.g gVar = this.f20535b;
        switch (i13) {
            case 0:
                ((f) gVar).j().z3();
                break;
            default:
                int i14 = cw.e.f53321w;
                ((cw.e) gVar).j().z3();
                break;
        }
    }
}
