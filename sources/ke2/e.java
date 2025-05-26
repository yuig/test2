package ke2;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.pinterest.xrenderer.RustBridge$Scene;
import com.pinterest.xrenderer.RustBridge$Sticker;
import e0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jk.r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f79323j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f79322i = i13;
        this.f79323j = fVar;
    }

    public final void b(d sceneItem) {
        switch (this.f79322i) {
            case 0:
                Intrinsics.checkNotNullParameter(sceneItem, "sceneItem");
                int i13 = sceneItem.f79319a.f79333a;
                if (this.f79323j.e(i13) < 0 && this.f79323j.a()) {
                    RustBridge$Scene rustBridge$Scene = RustBridge$Scene.f52862a;
                    long j13 = this.f79323j.f79327d;
                    Bitmap bitmap = sceneItem.f79319a.f79338f;
                    if (bitmap == null) {
                        bitmap = g.f79329a;
                    }
                    this.f79323j.f79328e.add(new Pair(Integer.valueOf(i13), Integer.valueOf(RustBridge$Sticker.f52863a.id(rustBridge$Scene.addSticker(j13, bitmap)))));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(sceneItem, "sceneItem");
                int e13 = this.f79323j.e(sceneItem.f79319a.f79333a);
                RustBridge$Scene rustBridge$Scene2 = RustBridge$Scene.f52862a;
                long stickerByID = rustBridge$Scene2.stickerByID(this.f79323j.f79327d, e13);
                if (stickerByID != 0 && this.f79323j.a()) {
                    i iVar = sceneItem.f79319a;
                    boolean z13 = iVar.f79337e;
                    iVar.f79337e = false;
                    if (z13) {
                        RustBridge$Sticker rustBridge$Sticker = RustBridge$Sticker.f52863a;
                        Bitmap bitmap2 = iVar.f79338f;
                        if (bitmap2 == null) {
                            bitmap2 = g.f79329a;
                        }
                        rustBridge$Sticker.updateBitmap(stickerByID, bitmap2);
                    }
                    RustBridge$Sticker rustBridge$Sticker2 = RustBridge$Sticker.f52863a;
                    b bVar = sceneItem.f79320b;
                    PointF pointF = bVar.f79304a;
                    rustBridge$Sticker2.setPos(stickerByID, pointF.x, pointF.y, bVar.f79305b);
                    rustBridge$Sticker2.setSize(stickerByID, sceneItem.f79319a.b(), sceneItem.f79319a.a());
                    rustBridge$Sticker2.setScale(stickerByID, sceneItem.f79320b.f79308e);
                    rustBridge$Sticker2.setRotation(stickerByID, (float) (sceneItem.f79320b.f79306c.f68913a * 360.0d));
                    a aVar = sceneItem.f79320b.f79307d;
                    rustBridge$Sticker2.setFlip(stickerByID, aVar.f79302a, aVar.f79303b);
                    i iVar2 = sceneItem.f79319a;
                    rustBridge$Sticker2.setOpacity(stickerByID, iVar2.f79338f != null ? iVar2.f79339g : 0.0f);
                    f fVar = this.f79323j;
                    i iVar3 = sceneItem.f79319a;
                    if (fVar.a()) {
                        c cVar = fVar.f79324a;
                        boolean z14 = cVar.f79311c;
                        cVar.f79311c = false;
                        long stickerByID2 = rustBridge$Scene2.stickerByID(fVar.f79327d, fVar.e(iVar3.f79333a));
                        List<od2.a> F0 = CollectionsKt.F0(iVar3.f79342j);
                        List<od2.b> F02 = CollectionsKt.F0(iVar3.f79341i);
                        List F03 = CollectionsKt.F0(iVar3.f79340h);
                        od2.c cVar2 = iVar3.f79343k;
                        boolean z15 = iVar3.f79336d;
                        iVar3.f79336d = false;
                        if ((z15 || z14) && fVar.a()) {
                            rustBridge$Sticker2.resetEffects(stickerByID2);
                            Iterator it = F0.iterator();
                            while (it.hasNext()) {
                                RustBridge$Sticker.f52863a.addColorEffect(stickerByID2, t.O0((od2.a) it.next()));
                            }
                            Iterator it2 = F02.iterator();
                            while (it2.hasNext()) {
                                RustBridge$Sticker.f52863a.addDistortionEffect(stickerByID2, t.O0((od2.b) it2.next()));
                            }
                            if (cVar2 != null) {
                                RustBridge$Sticker.f52863a.setKernelEffect(stickerByID2, t.O0(cVar2));
                            }
                            Iterator it3 = F03.iterator();
                            while (it3.hasNext()) {
                                nd2.b filter = (nd2.b) it3.next();
                                Intrinsics.checkNotNullParameter(filter, "filter");
                                mm.b builder = new mm.b();
                                Intrinsics.checkNotNullParameter(filter, "filter");
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                int f13 = builder.f(filter.f90426a);
                                List list = filter.f90427b;
                                Iterator it4 = it3;
                                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    arrayList.add(Integer.valueOf(builder.f((String) it5.next())));
                                }
                                int[] data = CollectionsKt.E0(arrayList);
                                ef2.a aVar2 = ff2.a.f62107f;
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                Intrinsics.checkNotNullParameter(data, "data");
                                builder.p(4, data.length, 4);
                                for (int length = data.length - 1; -1 < length; length--) {
                                    builder.c(data[length]);
                                }
                                int h10 = builder.h();
                                int f14 = builder.f(filter.f90428c);
                                int v13 = r.v(filter.f90431f, builder);
                                int M = c0.d.M(filter.f90429d, builder);
                                ef2.a aVar3 = ff2.a.f62107f;
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                List list2 = F03;
                                builder.o(5);
                                od2.c cVar3 = cVar2;
                                switch (aVar3.f58841a) {
                                    case 4:
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        builder.d(4, M);
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        builder.d(3, M);
                                        break;
                                }
                                switch (aVar3.f58841a) {
                                    case 4:
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        builder.d(3, v13);
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        builder.d(2, v13);
                                        break;
                                }
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(2, f14);
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(1, h10);
                                switch (aVar3.f58841a) {
                                    case 4:
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        builder.d(0, f13);
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        builder.d(0, f13);
                                        break;
                                }
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                int g13 = builder.g();
                                builder.l(g13, 4);
                                builder.l(g13, 6);
                                builder.l(g13, 8);
                                builder.l(g13, 10);
                                builder.l(g13, 12);
                                builder.i(g13);
                                byte[] m13 = builder.m();
                                Intrinsics.checkNotNullExpressionValue(m13, "sizedByteArray(...)");
                                RustBridge$Sticker.f52863a.addFilter(stickerByID2, m13);
                                it3 = it4;
                                F03 = list2;
                                cVar2 = cVar3;
                            }
                        }
                        List<nd2.b> list3 = F03;
                        od2.c cVar4 = cVar2;
                        int i14 = 0;
                        for (od2.a aVar4 : F0) {
                            int i15 = i14 + 1;
                            boolean z16 = aVar4.f94188d;
                            aVar4.f94188d = false;
                            if (z16 || z14) {
                                LinkedHashMap values = aVar4.f94189e.e();
                                Intrinsics.checkNotNullParameter(values, "values");
                                mm.b bVar2 = new mm.b();
                                bVar2.i(r.w(values, bVar2));
                                byte[] m14 = bVar2.m();
                                Intrinsics.checkNotNullExpressionValue(m14, "sizedByteArray(...)");
                                RustBridge$Sticker.f52863a.updateEffectSettings(stickerByID2, 0, i14, m14);
                            }
                            i14 = i15;
                        }
                        int i16 = 0;
                        for (od2.b bVar3 : F02) {
                            int i17 = i16 + 1;
                            boolean z17 = bVar3.f94188d;
                            bVar3.f94188d = false;
                            if (z17 || z14) {
                                LinkedHashMap values2 = bVar3.f94189e.e();
                                Intrinsics.checkNotNullParameter(values2, "values");
                                mm.b bVar4 = new mm.b();
                                bVar4.i(r.w(values2, bVar4));
                                byte[] m15 = bVar4.m();
                                Intrinsics.checkNotNullExpressionValue(m15, "sizedByteArray(...)");
                                RustBridge$Sticker.f52863a.updateEffectSettings(stickerByID2, 1, i16, m15);
                            }
                            i16 = i17;
                        }
                        if (cVar4 != null) {
                            boolean z18 = cVar4.f94188d;
                            cVar4.f94188d = false;
                            if (z18 || z14) {
                                LinkedHashMap values3 = cVar4.f94189e.e();
                                Intrinsics.checkNotNullParameter(values3, "values");
                                mm.b bVar5 = new mm.b();
                                bVar5.i(r.w(values3, bVar5));
                                byte[] m16 = bVar5.m();
                                Intrinsics.checkNotNullExpressionValue(m16, "sizedByteArray(...)");
                                RustBridge$Sticker.f52863a.updateEffectSettings(stickerByID2, 2, 0, m16);
                            }
                        }
                        int i18 = 0;
                        for (nd2.b bVar6 : list3) {
                            int i19 = i18 + 1;
                            boolean z19 = bVar6.f90430e;
                            bVar6.f90430e = false;
                            if (z19 || z14) {
                                LinkedHashMap values4 = bVar6.f90431f.e();
                                Intrinsics.checkNotNullParameter(values4, "values");
                                mm.b bVar7 = new mm.b();
                                bVar7.i(r.w(values4, bVar7));
                                byte[] m17 = bVar7.m();
                                Intrinsics.checkNotNullExpressionValue(m17, "sizedByteArray(...)");
                                RustBridge$Sticker.f52863a.updateEffectSettings(stickerByID2, 3, i18, m17);
                            }
                            i18 = i19;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f79322i) {
            case 0:
                b((d) obj);
                break;
            default:
                b((d) obj);
                break;
        }
        return Unit.f80348a;
    }
}
