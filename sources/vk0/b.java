package vk0;

import com.pinterest.api.model.c7;
import com.pinterest.api.model.cl;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import dl0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k32.c;
import kh2.d;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import q5.x0;

/* loaded from: classes5.dex */
public final class b implements uk0.b {

    /* renamed from: a, reason: collision with root package name */
    public String f126078a;

    /* renamed from: b, reason: collision with root package name */
    public String f126079b;

    /* renamed from: c, reason: collision with root package name */
    public String f126080c;

    /* renamed from: d, reason: collision with root package name */
    public String f126081d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f126082e;

    /* renamed from: f, reason: collision with root package name */
    public int f126083f;

    /* renamed from: g, reason: collision with root package name */
    public int f126084g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f126085h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126086i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f126087j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f126088k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f126089l;

    /* renamed from: m, reason: collision with root package name */
    public c[] f126090m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f126091n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f126092o;

    /* renamed from: p, reason: collision with root package name */
    public lh0 f126093p;

    /* renamed from: q, reason: collision with root package name */
    public e f126094q;

    /* renamed from: r, reason: collision with root package name */
    public String f126095r;

    /* renamed from: s, reason: collision with root package name */
    public wy0 f126096s;

    public b(v7 board) {
        c[] cVarArr;
        Object obj;
        Intrinsics.checkNotNullParameter(board, "board");
        this.f126078a = "";
        this.f126079b = "";
        String uid = board.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f126078a = uid;
        String j13 = board.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        this.f126079b = j13;
        this.f126082e = d.M0(board);
        Integer l13 = board.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        this.f126084g = l13.intValue();
        Intrinsics.checkNotNullExpressionValue(board.W0(), "getFollowerCount(...)");
        this.f126085h = d.A0(board);
        this.f126086i = w.h0(board);
        this.f126087j = w.i0(board);
        Integer q13 = board.q1();
        Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
        this.f126083f = q13.intValue();
        this.f126080c = board.R0();
        this.f126092o = d.a1(board) != null;
        this.f126081d = d.A(board);
        this.f126088k = board.Z0() != null;
        this.f126089l = d.E0(board);
        List<String> U0 = board.U0();
        if (U0 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : U0) {
                Iterator it = a.f126077a.iterator();
                while (true) {
                    x0 x0Var = (x0) it;
                    if (x0Var.hasNext()) {
                        obj = x0Var.next();
                        if (z.i(((c) obj).name(), str, true)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            cVarArr = (c[]) arrayList.toArray(new c[0]);
        } else {
            cVarArr = null;
        }
        this.f126090m = cVarArr;
        this.f126091n = d.B0(board);
        dl0.d dVar = e.Companion;
        j32.c B = d.B(board);
        dVar.getClass();
        this.f126094q = dl0.d.a(B);
        c7 B0 = board.B0();
        this.f126095r = B0 != null ? B0.h() : null;
        if (this.f126092o) {
            this.f126093p = d.a1(board);
        }
        Intrinsics.checkNotNullParameter(board, "<this>");
        Intrinsics.checkNotNullParameter(board, "<this>");
        cl T0 = board.T0();
        this.f126096s = T0 != null ? T0.i() : null;
    }
}
