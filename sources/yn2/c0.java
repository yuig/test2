package yn2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public class c0 extends y {
    public static kotlin.collections.a0 g(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new kotlin.collections.a0(sequence, 1);
    }

    public static int h(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            it.next();
            i13++;
            if (i13 < 0) {
                kotlin.collections.f0.o();
                throw null;
            }
        }
        return i13;
    }

    public static Sequence i(Sequence sequence, int i13) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i13 >= 0) {
            return i13 == 0 ? sequence : sequence instanceof f ? ((f) sequence).a(i13) : new e(sequence, i13, 0);
        }
        throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
    }

    public static i j(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new i(sequence, true, predicate);
    }

    public static i k(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new i(sequence, false, predicate);
    }

    public static Object l(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        h hVar = new h(iVar);
        if (hVar.hasNext()) {
            return hVar.next();
        }
        return null;
    }

    public static k m(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new k(sequence, transform, b0.f139537a);
    }

    public static String n(Sequence sequence, String separator, qo1.a aVar, int i13) {
        if ((i13 & 32) != 0) {
            aVar = null;
        }
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i14 = 0;
        for (Object obj : sequence) {
            i14++;
            if (i14 > 1) {
                buffer.append((CharSequence) separator);
            }
            kotlin.text.r.a(buffer, obj, aVar);
        }
        buffer.append((CharSequence) "");
        String sb3 = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static Object o(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static h0 p(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new h0(sequence, transform);
    }

    public static i q(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        h0 h0Var = new h0(sequence, transform);
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        return k(h0Var, a0.f139533i);
    }

    public static Sequence r(Sequence sequence, int i13) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i13 >= 0) {
            return i13 == 0 ? g.f139557a : sequence instanceof f ? ((f) sequence).b(i13) : new e(sequence, i13, 1);
        }
        throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
    }

    public static c s(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new c(sequence, predicate, 1);
    }

    public static List t(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return q0.f80391a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.e0.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList u(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }
}
