package com.google.android.gms.common.api;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.crypto.tink.shaded.protobuf.i0;
import com.google.firebase.components.ComponentRegistrar;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb.l0;
import lb0.o;
import lr.d0;
import pm.p;
import z40.n;

/* loaded from: classes.dex */
public class d implements sh.c, i0, sl.f, p {

    /* renamed from: b */
    public static d f30756b;

    /* renamed from: a */
    public final /* synthetic */ int f30757a;

    public d() {
        this.f30757a = 0;
    }

    public static RectF c(View view, TabLayout tabLayout) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.E || !(view instanceof ek.h)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        ek.h hVar = (ek.h) view;
        View[] viewArr = {hVar.f59139b, hVar.f59140c, hVar.f59141d};
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        for (int i15 = 0; i15 < 3; i15++) {
            View view2 = viewArr[i15];
            if (view2 != null && view2.getVisibility() == 0) {
                i14 = z13 ? Math.min(i14, view2.getLeft()) : view2.getLeft();
                i13 = z13 ? Math.max(i13, view2.getRight()) : view2.getRight();
                z13 = true;
            }
        }
        int i16 = i13 - i14;
        View[] viewArr2 = {hVar.f59139b, hVar.f59140c, hVar.f59141d};
        int i17 = 0;
        int i18 = 0;
        boolean z14 = false;
        for (int i19 = 0; i19 < 3; i19++) {
            View view3 = viewArr2[i19];
            if (view3 != null && view3.getVisibility() == 0) {
                i18 = z14 ? Math.min(i18, view3.getTop()) : view3.getTop();
                i17 = z14 ? Math.max(i17, view3.getBottom()) : view3.getBottom();
                z14 = true;
            }
        }
        int i23 = i17 - i18;
        int X = (int) l0.X(hVar.getContext(), 24);
        if (i16 < X) {
            i16 = X;
        }
        int right = (hVar.getRight() + hVar.getLeft()) / 2;
        int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
        int i24 = i16 / 2;
        return new RectF(right - i24, bottom - (i23 / 2), i24 + right, (right / 2) + bottom);
    }

    public static n d(wy0 activeUser, List conversations) {
        Object obj;
        z40.g c13;
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : conversations) {
            if (true ^ kh2.d.K0((n) obj2)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = CollectionsKt.x0(arrayList, new b4.f(8)).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            n nVar = (n) next;
            if (nVar.d() != null) {
                d dVar = d0.f84486g;
                z40.h d2 = nVar.d();
                Intrinsics.f(d2);
                String a13 = d2.a();
                dVar.getClass();
                o a14 = lb0.n.f82725d.a();
                Intrinsics.checkNotNullExpressionValue(a14, "user(...)");
                Set h10 = ((lb0.b) a14).h("PREF_UNREAD_MESSAGE_ID_SEEN_LAST_24H_2024_V1", null);
                boolean z13 = false;
                if (h10 != null) {
                    Set set = h10;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (StringsKt.E((String) it2.next(), a13, false)) {
                                z13 = true;
                                break;
                            }
                        }
                    }
                }
                if (!z13) {
                    z40.h d13 = nVar.d();
                    if (d13 != null && (c13 = d13.c()) != null) {
                        obj = c13.a();
                    }
                    if (!Intrinsics.d(obj, activeUser.getId())) {
                        obj = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return (n) obj;
    }

    @Override // sl.f
    public final List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (sl.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f113127a;
            if (str != null) {
                km.d dVar = new km.d(str, 1, bVar);
                bVar = new sl.b(str, bVar.f113128b, bVar.f113129c, bVar.f113130d, bVar.f113131e, dVar, bVar.f113133g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // sh.c
    public final e7.i b(Context context, String str, sh.b bVar) {
        int a13;
        int a14;
        int i13 = -1;
        switch (this.f30757a) {
            case 2:
                e7.i iVar = new e7.i();
                int a15 = bVar.a(context, str, true);
                iVar.f57539b = a15;
                if (a15 != 0) {
                    iVar.f57540c = 1;
                } else {
                    int d2 = bVar.d(context, str);
                    iVar.f57538a = d2;
                    if (d2 != 0) {
                        iVar.f57540c = -1;
                    }
                }
                return iVar;
            case 3:
                e7.i iVar2 = new e7.i();
                int a16 = bVar.a(context, str, false);
                iVar2.f57539b = a16;
                iVar2.f57540c = a16 != 0 ? 1 : 0;
                return iVar2;
            case 4:
                e7.i iVar3 = new e7.i();
                int d13 = bVar.d(context, str);
                iVar3.f57538a = d13;
                if (d13 != 0) {
                    a13 = bVar.a(context, str, false);
                    iVar3.f57539b = a13;
                } else {
                    a13 = bVar.a(context, str, true);
                    iVar3.f57539b = a13;
                }
                int i14 = iVar3.f57538a;
                if (i14 != 0) {
                    r2 = i14;
                } else if (a13 == 0) {
                    i13 = 0;
                    iVar3.f57540c = i13;
                    return iVar3;
                }
                if (r2 < a13) {
                    i13 = 1;
                }
                iVar3.f57540c = i13;
                return iVar3;
            default:
                e7.i iVar4 = new e7.i();
                int d14 = bVar.d(context, str);
                iVar4.f57538a = d14;
                if (d14 != 0) {
                    a14 = bVar.a(context, str, false);
                    iVar4.f57539b = a14;
                } else {
                    a14 = bVar.a(context, str, true);
                    iVar4.f57539b = a14;
                }
                int i15 = iVar4.f57538a;
                if (i15 != 0) {
                    r2 = i15;
                } else if (a14 == 0) {
                    i13 = 0;
                    iVar4.f57540c = i13;
                    return iVar4;
                }
                if (a14 >= r2) {
                    i13 = 1;
                }
                iVar4.f57540c = i13;
                return iVar4;
        }
    }

    public void e(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        RectF c13 = c(view, tabLayout);
        RectF c14 = c(view2, tabLayout);
        drawable.setBounds(gj.a.c((int) c13.left, f13, (int) c14.left), drawable.getBounds().top, gj.a.c((int) c13.right, f13, (int) c14.right), drawable.getBounds().bottom);
    }

    @Override // pm.p
    public final Object u() {
        return new pm.o();
    }

    public /* synthetic */ d(int i13) {
        this.f30757a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, int i14) {
        this(29);
        this.f30757a = i13;
        switch (i13) {
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                break;
        }
    }
}
