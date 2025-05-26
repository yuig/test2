package qz;

import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k f105409a;

    public i(k templateService) {
        Intrinsics.checkNotNullParameter(templateService, "templateService");
        this.f105409a = templateService;
    }

    public static final List a(i iVar, DynamicFeed dynamicFeed) {
        ArrayList arrayList;
        List a13;
        iVar.getClass();
        ArrayList arrayList2 = null;
        if (dynamicFeed == null || (a13 = dynamicFeed.a()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : a13) {
                if (obj instanceof f30) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!b40.F0((f30) obj2)) {
                    arrayList2.add(obj2);
                }
            }
        }
        return arrayList2 == null ? q0.f80391a : arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, int r9, int r10, bl2.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof qz.f
            if (r0 == 0) goto L14
            r0 = r11
            qz.f r0 = (qz.f) r0
            int r1 = r0.f105396u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f105396u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qz.f r0 = new qz.f
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f105394s
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f105396u
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            qz.i r8 = r6.f105393r
            ue.c.H(r11)
            goto L54
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ue.c.H(r11)
            n00.c r11 = n00.c.BOARD_PIN_FEED
            java.lang.String r3 = n00.b.a(r11)
            int r9 = java.lang.Math.min(r9, r10)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r6.f105393r = r7
            r6.f105396u = r2
            qz.k r1 = r7.f105409a
            r5 = 0
            r2 = r8
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L53
            return r0
        L53:
            r8 = r7
        L54:
            com.pinterest.api.adapter.coroutine.NetworkResponse r11 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r11
            qz.g r9 = new qz.g
            r10 = 0
            r9.<init>(r8, r10)
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = kh2.k3.y1(r11, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.i.b(java.lang.String, int, int, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r9, int r10, java.lang.String r11, bl2.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof qz.h
            if (r0 == 0) goto L14
            r0 = r12
            qz.h r0 = (qz.h) r0
            int r1 = r0.f105406u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f105406u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qz.h r0 = new qz.h
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f105404s
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f105406u
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 != r7) goto L2b
            qz.i r9 = r6.f105403r
            ue.c.H(r12)
            goto L50
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            ue.c.H(r12)
            n00.c r12 = n00.c.PIN_SELECTION_SHEET
            java.lang.String r3 = n00.b.a(r12)
            java.lang.String r4 = java.lang.String.valueOf(r10)
            r6.f105403r = r8
            r6.f105406u = r7
            qz.k r1 = r8.f105409a
            r2 = r9
            r5 = r11
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L4f
            return r0
        L4f:
            r9 = r8
        L50:
            com.pinterest.api.adapter.coroutine.NetworkResponse r12 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r12
            qz.g r10 = new qz.g
            r10.<init>(r9, r7)
            com.pinterest.api.adapter.coroutine.NetworkResponse r9 = kh2.k3.y1(r12, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.i.c(java.lang.String, int, java.lang.String, bl2.c):java.lang.Object");
    }
}
