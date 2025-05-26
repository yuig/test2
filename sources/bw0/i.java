package bw0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kb.s0;
import kb.t0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f24006a;

    public i(c ideaPinCommonWorkUtils) {
        Intrinsics.checkNotNullParameter(ideaPinCommonWorkUtils, "ideaPinCommonWorkUtils");
        this.f24006a = ideaPinCommonWorkUtils;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kb.t0 a(java.util.List r5) {
        /*
            java.lang.String r0 = "workInfoList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r5.next()
            r1 = r0
            kb.t0 r1 = (kb.t0) r1
            java.util.Set r2 = r1.f79032c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L2a
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2a
            goto Lb
        L2a:
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "cover_image_upload"
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 == 0) goto L2e
            kb.s0 r2 = kb.s0.SUCCEEDED
            kb.s0 r1 = r1.f79031b
            if (r1 != r2) goto Lb
            goto L4a
        L49:
            r0 = 0
        L4a:
            kb.t0 r0 = (kb.t0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bw0.i.a(java.util.List):kb.t0");
    }

    public static ArrayList b(i iVar, List workInfoList) {
        iVar.f24006a.getClass();
        List earlyUploadEligibleWorkTags = f0.j("video_upload", "image_upload");
        iVar.getClass();
        Intrinsics.checkNotNullParameter(workInfoList, "workInfoList");
        Intrinsics.checkNotNullParameter(earlyUploadEligibleWorkTags, "earlyUploadEligibleWorkTags");
        s0 s0Var = s0.SUCCEEDED;
        ArrayList arrayList = new ArrayList();
        for (Object obj : workInfoList) {
            t0 t0Var = (t0) obj;
            Set set = t0Var.f79032c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (earlyUploadEligibleWorkTags.contains((String) it.next())) {
                        if (t0Var.f79031b == s0Var) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
