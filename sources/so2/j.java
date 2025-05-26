package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends g {

    /* renamed from: c, reason: collision with root package name */
    public final ro2.c f114798c;

    /* renamed from: d, reason: collision with root package name */
    public int f114799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r writer, ro2.c json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f114798c = json;
    }

    @Override // so2.g
    public final void a() {
        this.f114788b = true;
        this.f114799d++;
    }

    @Override // so2.g
    public final void b() {
        this.f114788b = false;
        h("\n");
        int i13 = this.f114799d;
        for (int i14 = 0; i14 < i13; i14++) {
            h(this.f114798c.f108976a.f109018g);
        }
    }

    @Override // so2.g
    public final void c() {
        if (this.f114788b) {
            this.f114788b = false;
        } else {
            b();
        }
    }

    @Override // so2.g
    public final void k() {
        e(' ');
    }

    @Override // so2.g
    public final void l() {
        this.f114799d--;
    }
}
