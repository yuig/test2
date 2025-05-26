package uv0;

/* loaded from: classes5.dex */
public final class e extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uj2.c f123164b;

    public e(fk2.f fVar, int i13) {
        this.f123163a = i13;
        this.f123164b = fVar;
    }

    @Override // hs1.c
    public final void d() {
        int i13 = this.f123163a;
        uj2.c cVar = this.f123164b;
        switch (i13) {
            case 0:
                ((fk2.f) cVar).d(new RuntimeException("Story Pin adjusted cover page video keyframe failed to load"));
                break;
            default:
                ((fk2.f) cVar).d(new RuntimeException("Unified Pin adjusted page image failed to load"));
                break;
        }
    }

    @Override // hs1.c
    public final void e() {
        int i13 = this.f123163a;
        uj2.c cVar = this.f123164b;
        switch (i13) {
            case 0:
                ((fk2.f) cVar).b();
                break;
            default:
                ((fk2.f) cVar).b();
                break;
        }
    }
}
