package vx;

import h32.f1;
import h32.i0;
import h32.w0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import nx.m0;

/* loaded from: classes.dex */
public final class d implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f126810a = new ArrayList(40);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f126811b = new ArrayList(40);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f126812c = new ArrayList(40);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f126813d = new ArrayList(40);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f126814e = new ArrayList(40);

    public final void a(w0 event) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        Intrinsics.checkNotNullParameter(event, "event");
        String[] strArr = new String[4];
        i0 i0Var = event.f67330h;
        Object obj5 = "NULL";
        if (i0Var == null || (obj = i0Var.f67081a) == null) {
            obj = "NULL";
        }
        strArr[0] = String.valueOf(obj);
        if (i0Var == null || (obj2 = i0Var.f67082b) == null) {
            obj2 = "NULL";
        }
        strArr[1] = String.valueOf(obj2);
        if (i0Var == null || (obj3 = i0Var.f67084d) == null) {
            obj3 = "NULL";
        }
        strArr[2] = String.valueOf(obj3);
        if (i0Var != null && (obj4 = i0Var.f67086f) != null) {
            obj5 = obj4;
        }
        strArr[3] = String.valueOf(obj5);
        List j13 = f0.j(strArr);
        int i13 = i0Var != null ? i0Var.f67081a == null ? -65536 : i0Var.f67082b == null ? -65281 : -1 : -16711681;
        ArrayList arrayList = this.f126810a;
        f1 f1Var = event.f67324b;
        arrayList.add(String.valueOf(f1Var));
        arrayList.addAll(j13);
        for (int i14 = 0; i14 < 5; i14++) {
            this.f126814e.add(Integer.valueOf(i13));
        }
        Long l13 = event.f67323a;
        if (l13 != null) {
            str = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault()).format(Instant.ofEpochMilli(l13.longValue() / 1000000));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        ArrayList arrayList2 = this.f126811b;
        if (str != null) {
            arrayList2.add(str);
        } else {
            arrayList2.add("NULL time stamp");
        }
        this.f126812c.add(String.valueOf(f1Var));
        StringBuilder D = ep.b.D("Context: " + i0Var + "\n", "AuxData: ");
        D.append(event.f67327e);
        D.append("\n");
        this.f126813d.add(D.toString());
    }
}
