package jm2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import bm2.n;
import bm2.p;
import gm2.v;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import xl2.q;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f77055a = z0.g(new Pair("PACKAGE", EnumSet.noneOf(p.class)), new Pair(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(p.CLASS, p.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(p.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(p.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(p.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(p.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(p.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(p.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(p.FUNCTION, p.PROPERTY_GETTER, p.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(p.TYPE)));

    /* renamed from: b, reason: collision with root package name */
    public static final Map f77056b = z0.g(new Pair("RUNTIME", n.RUNTIME), new Pair("CLASS", n.BINARY), new Pair("SOURCE", n.SOURCE));

    public static dn2.b a(List arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof pm2.k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f77055a.get(((v) ((pm2.k) it.next())).a().b());
            if (iterable == null) {
                iterable = s0.f80394a;
            }
            k0.u(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            ym2.b j13 = ym2.b.j(q.f135315u);
            Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
            ym2.g e13 = ym2.g.e(pVar.name());
            Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
            arrayList3.add(new dn2.i(j13, e13));
        }
        return new dn2.b(arrayList3, d.f77054i);
    }
}
