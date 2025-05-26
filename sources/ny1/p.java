package ny1;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final List f92683a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f92684b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f92685c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f92686d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f92687e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f92688f;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.String r2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            java.util.List r2 = kotlin.collections.e0.b(r2)
            goto Lf
        Ld:
            kotlin.collections.q0 r2 = kotlin.collections.q0.f80391a
        Lf:
            ny1.p.f92683a = r2
            r2 = 0
            if (r0 < r1) goto L1d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.List r1 = kotlin.collections.e0.b(r1)
            goto L1f
        L1d:
            kotlin.collections.q0 r1 = kotlin.collections.q0.f80391a
        L1f:
            ny1.p.f92684b = r1
            r1 = 33
            if (r0 < r1) goto L3a
            android.content.Context r3 = kb0.a.f79058b
            kb0.a r3 = m60.f0.j0()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 < r1) goto L3a
            java.lang.String r3 = "android.permission.POST_NOTIFICATIONS"
            java.util.List r3 = kotlin.collections.e0.b(r3)
            goto L3c
        L3a:
            kotlin.collections.q0 r3 = kotlin.collections.q0.f80391a
        L3c:
            ny1.p.f92685c = r3
            r3 = 29
            if (r0 < r1) goto L5d
            android.content.Context r4 = kb0.a.f79058b
            kb0.a r4 = m60.f0.j0()
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            if (r4 < r1) goto L5d
            java.lang.String r4 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r5 = "android.permission.READ_MEDIA_VIDEO"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = kotlin.collections.f0.j(r4)
            goto L70
        L5d:
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r0 <= r3) goto L66
            java.util.List r4 = kotlin.collections.e0.b(r4)
            goto L70
        L66:
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = kotlin.collections.f0.j(r4)
        L70:
            ny1.p.f92686d = r4
            if (r0 < r1) goto L95
            android.content.Context r4 = kb0.a.f79058b
            kb0.a r4 = m60.f0.j0()
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            if (r4 < r1) goto L95
            int r3 = py1.b.storage_permission_explanation
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r4}
            java.util.List r3 = kotlin.collections.f0.j(r3)
            goto Lb4
        L95:
            if (r0 <= r3) goto La2
            int r3 = py1.b.storage_permission_explanation
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.List r3 = kotlin.collections.e0.b(r3)
            goto Lb4
        La2:
            int r3 = py1.b.storage_permission_explanation
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r4}
            java.util.List r3 = kotlin.collections.f0.j(r3)
        Lb4:
            ny1.p.f92687e = r3
            if (r0 < r1) goto Ld9
            android.content.Context r0 = kb0.a.f79058b
            kb0.a r0 = m60.f0.j0()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 < r1) goto Ld9
            int r0 = py1.b.storage_permission_download_explanation
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1}
            java.util.List r0 = kotlin.collections.f0.j(r0)
            goto Le3
        Ld9:
            int r0 = py1.b.storage_permission_download_explanation
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = kotlin.collections.e0.b(r0)
        Le3:
            ny1.p.f92688f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ny1.p.<clinit>():void");
    }

    public static final String a(n nVar, Context context) {
        String string;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (nVar.f92675b.isEmpty()) {
            return "";
        }
        List list = nVar.f92675b;
        int size = list.size();
        List list2 = nVar.f92676c;
        if (size == 1) {
            if (list2.isEmpty()) {
                Resources resources = context.getResources();
                Intrinsics.checkNotNullParameter(list, "<this>");
                string = resources.getString(((Number) CollectionsKt.S(list)).intValue());
            } else {
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullParameter(list, "<this>");
                int intValue = ((Number) CollectionsKt.S(list)).intValue();
                Intrinsics.checkNotNullParameter(list2, "<this>");
                Object[] array = ((Collection) CollectionsKt.S(list2)).toArray(new Object[0]);
                string = resources2.getString(intValue, Arrays.copyOf(array, array.length));
            }
            String str = string;
            Intrinsics.f(str);
            return str;
        }
        List list3 = nVar.f92674a;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : list3) {
            int i14 = i13 + 1;
            String str2 = null;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            if (!a0.G0(context, (String) obj)) {
                if (((Number) list.get(i13)).intValue() == 0) {
                    str2 = "";
                } else if (list2.isEmpty()) {
                    str2 = context.getResources().getString(((Number) list.get(i13)).intValue());
                } else {
                    List list4 = (List) list2.get(i13);
                    if (list4.isEmpty()) {
                        str2 = context.getResources().getString(((Number) list.get(i13)).intValue());
                    } else {
                        Resources resources3 = context.getResources();
                        int intValue2 = ((Number) list.get(i13)).intValue();
                        Object[] array2 = list4.toArray(new Object[0]);
                        str2 = resources3.getString(intValue2, Arrays.copyOf(array2, array2.length));
                    }
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i13 = i14;
        }
        return CollectionsKt.Z(arrayList, " ", null, null, 0, null, null, 62);
    }
}
