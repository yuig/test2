package kv0;

import J.N;
import a.cb;
import android.content.Context;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.boardAutoCollages.l0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.menu.ContextMenuItemView;
import com.pinterest.ui.menu.ContextMenuView;
import do2.t2;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.o0;
import lh0.s1;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import o82.h2;
import o82.i0;
import o82.m2;
import o82.m3;
import o82.n2;
import o82.r1;
import so.oa;
import so.r8;
import x02.i2;

/* loaded from: classes5.dex */
public final class p implements gp2.e {

    /* renamed from: a */
    public Object f80994a;

    /* renamed from: b */
    public Object f80995b;

    /* renamed from: c */
    public Object f80996c;

    public p(int i13) {
        if (i13 != 7) {
            this.f80994a = new ArrayList();
            this.f80995b = new ArrayList();
            this.f80996c = new LinkedHashSet();
        } else {
            this.f80994a = new gd2.c(ee2.b.f58810m, null, 5);
            id2.c.Companion.getClass();
            this.f80995b = id2.b.a(-1);
            this.f80996c = new ArrayList();
        }
    }

    public static void b(p pVar, m3 viewTypeExtractor, o82.p itemIdExtractor, r1 sectionLoader, boolean z13, o82.i gridSpacer, m2 sectionWatcher, gx.e eVar, o82.o oVar, String sectionId, gx.e eVar2, int i13) {
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        if ((i13 & 16) != 0) {
            gridSpacer = new l0(14);
        }
        if ((i13 & 32) != 0) {
            sectionWatcher = new n2();
        }
        if ((i13 & 64) != 0) {
            eVar = null;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            oVar = null;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            sectionId = cb.g("toString(...)");
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            eVar2 = null;
        }
        Intrinsics.checkNotNullParameter(viewTypeExtractor, "viewTypeExtractor");
        Intrinsics.checkNotNullParameter(itemIdExtractor, "itemIdExtractor");
        Intrinsics.checkNotNullParameter(sectionLoader, "sectionLoader");
        Intrinsics.checkNotNullParameter(gridSpacer, "gridSpacer");
        Intrinsics.checkNotNullParameter(sectionWatcher, "sectionWatcher");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        ((List) pVar.f80994a).add(new h2(viewTypeExtractor, itemIdExtractor, gridSpacer, z13));
        ((List) pVar.f80995b).add(new mb0.a(new l82.g[]{sectionLoader, sectionWatcher, eVar, oVar, eVar2}));
        if (((Set) pVar.f80996c).contains(sectionId)) {
            throw new IllegalArgumentException(a.a.k("Section with ID ", sectionId, " was already added."));
        }
        ((Set) pVar.f80996c).add(sectionId);
    }

    public static void l(String str) {
        ek0.b bVar = new ek0.b(10);
        p pVar = new p();
        pVar.f80996c = new ConcurrentHashMap(1);
        pVar.f80994a = str;
        pVar.f80995b = bVar;
    }

    @Override // gp2.e
    public final void a(int i13, Runnable runnable) {
        ((gp2.h) g(i13)).d(runnable);
    }

    @Override // gp2.e
    public final boolean c() {
        gp2.d dVar = (gp2.d) g(7);
        synchronized (dVar.f65955f) {
            dVar.c();
        }
        Boolean valueOf = dVar.f65953d == 0 ? null : Boolean.valueOf(N.MdFi6sVQ(dVar.f65953d));
        return valueOf != null ? valueOf.booleanValue() : dVar.f65946l.getLooper().getThread() == Thread.currentThread();
    }

    public final g01.a d() {
        return new g01.a(new i0((List) this.f80994a, (Set) this.f80996c), new mb0.a((List) this.f80995b));
    }

    public final boolean e(String name) {
        Intrinsics.checkNotNullParameter(name, "action");
        boolean z13 = ((AtomicBoolean) this.f80996c).get();
        if (!z13) {
            ((lh2.e) ((lh2.b) this.f80994a)).c(name);
        }
        gi2.a aVar = (gi2.a) this.f80995b;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(name, "name");
            synchronized (aVar.f65164c) {
                try {
                    ConcurrentHashMap concurrentHashMap = aVar.f65164c;
                    Integer num = (Integer) concurrentHashMap.get(name);
                    if (num == null) {
                        num = 0;
                    }
                    concurrentHashMap.put(name, Integer.valueOf(num.intValue() + 1));
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return z13;
    }

    public final jv0.o f(Context context, jv0.p navigator, n70.o pinalytics, jv0.i viewModelProvider, String str, aq.j jVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        if (jVar != null) {
            r8 r8Var = ((so.g) this.f80994a).f113424a;
            i2 i2Var = (i2) r8Var.f114090a.F3.get();
            oa oaVar = r8Var.f114090a;
            return new j(context, navigator, viewModelProvider, jVar, pinalytics, i2Var, (m60.w) oaVar.f113885r0.get(), (i92.k) oaVar.f113921t1.get(), (s1) oaVar.f113718h8.get());
        }
        so.h hVar = (so.h) this.f80995b;
        String d2 = ((ag1.b) this.f80996c).d();
        r8 r8Var2 = hVar.f113439a;
        ag1.b bVar = (ag1.b) r8Var2.f114090a.Z7.get();
        oa oaVar2 = r8Var2.f114090a;
        return new f(context, d2, str, navigator, pinalytics, viewModelProvider, bVar, (i22.d) oaVar2.X7.get(), (bw0.f) oaVar2.f113736i8.get(), (tb0.h) oaVar2.f113797m0.get(), (ag1.h) oaVar2.K8.get());
    }

    public final gp2.c g(int i13) {
        if (6 == i13) {
            return (gp2.c) this.f80994a;
        }
        if (7 == i13) {
            return (gp2.c) this.f80995b;
        }
        if (8 == i13) {
            return (gp2.c) this.f80996c;
        }
        throw new RuntimeException();
    }

    public final androidx.appcompat.widget.a h(rl2.u property) {
        Intrinsics.checkNotNullParameter(property, "property");
        androidx.appcompat.widget.a aVar = (androidx.appcompat.widget.a) this.f80996c;
        if (aVar == null) {
            aVar = ((bn0.a) this.f80994a).m((String) this.f80995b);
        }
        this.f80996c = aVar;
        return aVar;
    }

    public final void i() {
        Object value;
        h62.i iVar = (h62.i) this.f80994a;
        int size = ((LinkedList) this.f80995b).size();
        int size2 = ((LinkedList) this.f80996c).size();
        t2 t2Var = iVar.f67836a.f67842d;
        do {
            value = t2Var.getValue();
            ((h62.l) value).getClass();
        } while (!t2Var.h(value, new h62.l(size, size2)));
    }

    public final void j() {
        try {
            Object obj = this.f80996c;
            if (obj != null) {
                obj.getClass().getMethod("release", new Class[0]).invoke(this.f80996c, new Object[0]);
                this.f80996c = null;
            }
        } catch (Exception unused) {
        }
        Object obj2 = this.f80995b;
        if (((RandomAccessFile) obj2) != null) {
            try {
                ((RandomAccessFile) obj2).close();
            } catch (IOException unused2) {
            }
            this.f80995b = null;
        }
        Object obj3 = this.f80994a;
        if (((File) obj3) != null && ((File) obj3).exists()) {
            ((File) this.f80994a).delete();
        }
        this.f80994a = null;
    }

    public final void k(ContextMenuView menu, m10.d event, String apiTag) {
        v7 u13;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(apiTag, "apiTag");
        Context context = menu.getContext();
        ba baVar = (ba) event.f85658b;
        if (baVar == null || (u13 = baVar.u()) == null) {
            return;
        }
        String id3 = baVar.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        String id4 = u13.getId();
        Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
        ContextMenuItemView[] contextMenuItemViewArr = new ContextMenuItemView[1];
        Intrinsics.f(context);
        cb2.d onClickAction = new cb2.d(this, id3, id4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        ContextMenuItemView C = ig1.b.C(context, new cb2.g(rm1.q.EDIT, x0.contextmenu_edit, x0.icon_edit, onClickAction));
        if (((o0) this.f80996c).c()) {
            ig1.b.o1(C);
        }
        contextMenuItemViewArr[0] = C;
        ArrayList l13 = f0.l(contextMenuItemViewArr);
        if (!kh2.d.A0(u13)) {
            cb2.d onClickAction2 = new cb2.d(this, id3, id4, 1);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onClickAction2, "onClickAction");
            ContextMenuItemView C2 = ig1.b.C(context, new cb2.g(rm1.q.LIGHTBULB, x0.contextmenu_related, x0.icon_see_related, onClickAction2));
            if (((o0) this.f80996c).c()) {
                ig1.b.o1(C2);
            }
            l13.add(C2);
            Integer q13 = u13.q1();
            Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
            if (q13.intValue() > 1) {
                c72.o onClickAction3 = new c72.o(this, 21);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(onClickAction3, "onClickAction");
                ContextMenuItemView C3 = ig1.b.C(context, new cb2.g(rm1.q.ARROWS_VERTICAL, x0.contextmenu_reorder, x0.icon_reorder, onClickAction3));
                if (((o0) this.f80996c).c()) {
                    ig1.b.o1(C3);
                }
                l13.add(C3);
            }
        }
        menu.a(l13);
        menu.n(event, null);
    }

    public final void m(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        h62.h hVar = (h62.h) ((LinkedList) this.f80995b).poll();
        if (hVar != null) {
            block.invoke(hVar);
            ((LinkedList) this.f80996c).push(hVar.b());
            i();
        }
    }

    public p(am2.k classifierDescriptor, List arguments, p pVar) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f80994a = classifierDescriptor;
        this.f80995b = arguments;
        this.f80996c = pVar;
    }

    public p(bn0.a program, String name) {
        Intrinsics.checkNotNullParameter(program, "program");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f80994a = program;
        this.f80995b = name;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3) {
        this.f80994a = obj;
        this.f80995b = obj2;
        this.f80996c = obj3;
    }

    public p(IntRange argumentRange, List[] unboxParameters, Method method) {
        Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
        Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
        this.f80994a = argumentRange;
        this.f80995b = unboxParameters;
        this.f80996c = method;
    }

    public p(so.g editableFactory, so.h draftFactory, ag1.b dataManager) {
        Intrinsics.checkNotNullParameter(editableFactory, "editableFactory");
        Intrinsics.checkNotNullParameter(draftFactory, "draftFactory");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        this.f80994a = editableFactory;
        this.f80995b = draftFactory;
        this.f80996c = dataManager;
    }

    public p(hq2.c cVar, lq2.a aVar) {
        this.f80994a = cVar;
        this.f80995b = aVar;
        this.f80996c = new t72.j(cVar.h(aVar.f84466a), 15);
    }
}
