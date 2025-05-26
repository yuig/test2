package d80;

import bg.d;
import com.bugsnag.android.Severity;
import com.bugsnag.android.f2;
import com.bugsnag.android.i1;
import com.bugsnag.android.k1;
import com.bugsnag.android.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import tb0.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f53992b;

    public /* synthetic */ b(d dVar, int i13) {
        this.f53991a = i13;
        this.f53992b = dVar;
    }

    @Override // com.bugsnag.android.f2
    public final boolean a(x0 event) {
        switch (this.f53991a) {
            case 0:
                d this$0 = this.f53992b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                Collection values = ((Map) this$0.f22760d).values();
                if (values != null) {
                    k1 k1Var = event.f29685a.f29719d;
                    synchronized (k1Var) {
                        try {
                            i1[] i1VarArr = k1Var.f29317a;
                            ArrayList arrayList = new ArrayList(values instanceof Collection ? i1VarArr.length + values.size() : Math.max(i1VarArr.length * 2, i1VarArr.length));
                            k0.v(arrayList, i1VarArr);
                            Iterator it = values.iterator();
                            while (true) {
                                int i13 = 0;
                                if (it.hasNext()) {
                                    i1 i1Var = (i1) it.next();
                                    String str = i1Var.f29271a;
                                    String str2 = i1Var.f29272b;
                                    Iterator it2 = arrayList.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            i13 = -1;
                                        } else if (!Intrinsics.d(((i1) it2.next()).f29271a, str)) {
                                            i13++;
                                        }
                                    }
                                    if (i13 == -1) {
                                        arrayList.add(new i1(str, str2));
                                    } else {
                                        arrayList.set(i13, new i1(str, str2));
                                    }
                                } else {
                                    Object[] array = arrayList.toArray(new i1[0]);
                                    if (array == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    }
                                    k1Var.f29317a = (i1[]) array;
                                    Unit unit = Unit.f80348a;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    event.b("addFeatureFlags");
                }
                return true;
            default:
                d this$02 = this.f53992b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                Severity severity = Severity.ERROR;
                if (severity != null) {
                    event.f29685a.f29716a.f29417e = severity;
                } else {
                    event.b("severity");
                }
                event.a((String) this$02.f22761e, (String) this$02.f22762f, p.UNSPECIFIED.toString());
                return true;
        }
    }
}
