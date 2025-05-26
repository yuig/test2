package z3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j */
    public static final s f140720j = new s(1);

    /* renamed from: k */
    public static final s f140721k = new s(3);

    /* renamed from: l */
    public static final s f140722l = new s(4);

    /* renamed from: m */
    public static final s f140723m = new s(5);

    /* renamed from: n */
    public static final s f140724n = new s(6);

    /* renamed from: o */
    public static final s f140725o = new s(7);

    /* renamed from: p */
    public static final s f140726p = new s(8);

    /* renamed from: q */
    public static final s f140727q = new s(9);

    /* renamed from: r */
    public static final s f140728r = new s(10);

    /* renamed from: s */
    public static final s f140729s = new s(11);

    /* renamed from: t */
    public static final s f140730t = new s(12);

    /* renamed from: i */
    public final /* synthetic */ int f140731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13) {
        super(2);
        this.f140731i = i13;
    }

    public final List b(List list, List list2) {
        switch (this.f140731i) {
            case 1:
                if (list == null) {
                    return list2;
                }
                ArrayList H0 = CollectionsKt.H0(list);
                H0.addAll(list2);
                return H0;
            default:
                if (list == null) {
                    return list2;
                }
                ArrayList H02 = CollectionsKt.H0(list);
                H02.addAll(list2);
                return H02;
        }
    }

    public final void e(Unit unit) {
        switch (this.f140731i) {
            case 3:
                return;
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            default:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        xk2.g gVar;
        int i13 = this.f140731i;
        switch (i13) {
            case 0:
                ep.b.A(obj);
                ep.b.A(obj2);
                throw null;
            case 1:
                return b((List) obj, (List) obj2);
            case 2:
                ep.b.A(obj);
                ep.b.A(obj2);
                return null;
            case 3:
                Unit unit = (Unit) obj;
                e(unit);
                return unit;
            case 4:
                Unit unit2 = (Unit) obj;
                e(unit2);
                return unit2;
            case 5:
                Unit unit3 = (Unit) obj;
                e(unit3);
                return unit3;
            case 6:
                String str2 = (String) obj;
                switch (i13) {
                    case 6:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str2;
                }
            case 7:
                g gVar2 = (g) obj;
                int i14 = ((g) obj2).f140670a;
                return gVar2;
            case 8:
                String str3 = (String) obj;
                switch (i13) {
                    case 6:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str3;
                }
            case 9:
                return b((List) obj, (List) obj2);
            case 10:
                Float f13 = (Float) obj;
                ((Number) obj2).floatValue();
                return f13;
            case 11:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f140658a) == null) {
                    str = aVar2.f140658a;
                }
                if (aVar == null || (gVar = aVar.f140659b) == null) {
                    gVar = aVar2.f140659b;
                }
                return new a(str, gVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
