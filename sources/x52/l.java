package x52;

import android.media.MediaCodec;
import ao2.j0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {
    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(2, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        LinkedHashMap linkedHashMap = en0.c.f59645b;
        linkedHashMap.clear();
        zn2.h.f142318a.getClass();
        zn2.f.f142316a.getClass();
        long a13 = zn2.f.a();
        EnumSet of = EnumSet.of(en0.b.FULL_HD, en0.b.HDR);
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        en0.b bVar = en0.b.INVALID;
        Iterator it = of.iterator();
        while (true) {
            if (!it.hasNext()) {
                Objects.toString(bVar);
                break;
            }
            en0.b bVar2 = (en0.b) it.next();
            Objects.toString(bVar2);
            Intrinsics.f(bVar2);
            ArrayList arrayList = new ArrayList();
            try {
                ArrayList a14 = en0.c.a(bVar2, 3);
                int size = a14.size();
                bVar2.getLongDimension();
                bVar2.getShortDimension();
                bVar2.toString();
                Objects.toString(linkedHashMap);
                Iterator it2 = a14.iterator();
                while (it2.hasNext()) {
                    MediaCodec mediaCodec = (MediaCodec) it2.next();
                    try {
                        mediaCodec.stop();
                    } catch (Exception unused) {
                    }
                    try {
                        mediaCodec.release();
                    } catch (Exception unused2) {
                    }
                }
                a14.clear();
                System.gc();
                if (size >= 3) {
                    bVar2.toString();
                    bVar = bVar2;
                    break;
                }
            } catch (Throwable th3) {
                arrayList.size();
                bVar2.getLongDimension();
                bVar2.getShortDimension();
                bVar2.toString();
                Objects.toString(linkedHashMap);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    MediaCodec mediaCodec2 = (MediaCodec) it3.next();
                    try {
                        mediaCodec2.stop();
                    } catch (Exception unused3) {
                    }
                    try {
                        mediaCodec2.release();
                    } catch (Exception unused4) {
                    }
                }
                arrayList.clear();
                System.gc();
                throw th3;
            }
        }
        zn2.i iVar = new zn2.i(bVar, zn2.g.a(a13), null);
        zn2.b.e(iVar.f142320b);
        en0.b bVar3 = (en0.b) iVar.f142319a;
        en0.c.f59644a = bVar3;
        Objects.toString(bVar3);
        return en0.c.f59644a;
    }
}
