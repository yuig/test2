package zb;

import android.graphics.PointF;

/* loaded from: classes3.dex */
public final class r extends androidx.appcompat.app.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kc.b f141531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.d f141532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc.c f141533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kc.b bVar, androidx.appcompat.app.d dVar, cc.c cVar) {
        super(23);
        this.f141531f = bVar;
        this.f141532g = dVar;
        this.f141533h = cVar;
    }

    @Override // androidx.appcompat.app.d
    public final Object A(kc.b bVar) {
        float f13 = bVar.f79119a;
        float f14 = bVar.f79120b;
        String str = ((cc.c) bVar.f79121c).f27411a;
        String str2 = ((cc.c) bVar.f79122d).f27411a;
        float f15 = bVar.f79123e;
        float f16 = bVar.f79124f;
        float f17 = bVar.f79125g;
        kc.b bVar2 = this.f141531f;
        bVar2.f79119a = f13;
        bVar2.f79120b = f14;
        bVar2.f79121c = str;
        bVar2.f79122d = str2;
        bVar2.f79123e = f15;
        bVar2.f79124f = f16;
        bVar2.f79125g = f17;
        String str3 = (String) this.f141532g.A(bVar2);
        cc.c cVar = (cc.c) (bVar.f79124f == 1.0f ? bVar.f79122d : bVar.f79121c);
        String str4 = cVar.f27412b;
        float f18 = cVar.f27413c;
        cc.b bVar3 = cVar.f27414d;
        int i13 = cVar.f27415e;
        float f19 = cVar.f27416f;
        float f23 = cVar.f27417g;
        int i14 = cVar.f27418h;
        int i15 = cVar.f27419i;
        float f24 = cVar.f27420j;
        boolean z13 = cVar.f27421k;
        PointF pointF = cVar.f27422l;
        PointF pointF2 = cVar.f27423m;
        cc.c cVar2 = this.f141533h;
        cVar2.f27411a = str3;
        cVar2.f27412b = str4;
        cVar2.f27413c = f18;
        cVar2.f27414d = bVar3;
        cVar2.f27415e = i13;
        cVar2.f27416f = f19;
        cVar2.f27417g = f23;
        cVar2.f27418h = i14;
        cVar2.f27419i = i15;
        cVar2.f27420j = f24;
        cVar2.f27421k = z13;
        cVar2.f27422l = pointF;
        cVar2.f27423m = pointF2;
        return cVar2;
    }
}
