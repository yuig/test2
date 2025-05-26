package z3;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import m1.f2;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f140760a;

    static {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x(w.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        l0 l0Var = k0.f80436a;
        f140760a = new rl2.u[]{l0Var.e(xVar), a.a.y(w.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, l0Var), a.a.y(w.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, l0Var), a.a.y(w.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, l0Var), a.a.y(w.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, l0Var), a.a.y(w.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, l0Var), a.a.y(w.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, l0Var), a.a.y(w.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, l0Var), a.a.y(w.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, l0Var), a.a.y(w.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, l0Var), a.a.y(w.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, l0Var), a.a.y(w.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, l0Var), a.a.y(w.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, l0Var), a.a.y(w.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, l0Var), a.a.y(w.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, l0Var), a.a.y(w.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, l0Var), a.a.y(w.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, l0Var), a.a.y(w.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, l0Var), a.a.y(w.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, l0Var), a.a.y(w.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, l0Var), a.a.y(w.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, l0Var), a.a.y(w.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, l0Var), a.a.y(w.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, l0Var), a.a.y(w.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, l0Var), a.a.y(w.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, l0Var), a.a.y(w.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, l0Var)};
        t tVar = t.f140732a;
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        tVar.getClass();
        x xVar2 = i.f140674a;
    }

    public static final x a(String str) {
        x xVar = new x(str);
        xVar.f140763c = true;
        return xVar;
    }

    public static final x b(String str, s sVar) {
        return new x(str, true, sVar);
    }

    public static void c(y yVar, Function1 function1) {
        ((j) yVar).e(i.f140674a, new a(null, function1));
    }

    public static void d(j jVar, i1.j jVar2) {
        jVar.e(i.f140677d, new a(null, jVar2));
    }

    public static final void e(j jVar, f2 f2Var) {
        jVar.e(i.f140678e, f2Var);
    }

    public static final void f(y yVar, String str) {
        t tVar = t.f140732a;
        ((j) yVar).e(t.f140733b, e0.b(str));
    }

    public static final void g(j jVar, h hVar) {
        x xVar = t.f140747p;
        rl2.u uVar = f140760a[10];
        xVar.getClass();
        jVar.e(xVar, hVar);
    }

    public static final void h(y yVar, int i13) {
        x xVar = t.f140751t;
        rl2.u uVar = f140760a[12];
        xVar.a(yVar, new g(i13));
    }
}
