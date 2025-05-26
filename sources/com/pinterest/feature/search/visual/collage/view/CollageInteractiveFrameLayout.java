package com.pinterest.feature.search.visual.collage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b01.c;
import e81.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.j;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/search/visual/collage/view/CollageInteractiveFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CollageInteractiveFrameLayout extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47942c = 0;

    /* renamed from: a, reason: collision with root package name */
    public h f47943a;

    /* renamed from: b, reason: collision with root package name */
    public final v f47944b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollageInteractiveFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return arrayList;
            }
            View childAt = getChildAt(childCount);
            if (childAt instanceof h) {
                arrayList.add(childAt);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev2) {
        h hVar;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (((j) this.f47944b.getValue()).f102463a.onTouchEvent(ev2)) {
            return true;
        }
        ArrayList a13 = a();
        int actionMasked = ev2.getActionMasked();
        Object obj = null;
        if (actionMasked == 0) {
            Iterator it = a13.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                h hVar2 = (h) next;
                if (hVar2.t() && hVar2.n(ev2)) {
                    obj = next;
                    break;
                }
            }
            h hVar3 = (h) obj;
            this.f47943a = hVar3;
            if (hVar3 != null) {
                hVar3.e(ev2);
            }
        } else if (actionMasked == 1) {
            h hVar4 = this.f47943a;
            if (hVar4 != null) {
                hVar4.q(ev2);
            }
            this.f47943a = null;
        } else if (actionMasked == 2) {
            h hVar5 = this.f47943a;
            if (hVar5 != null) {
                hVar5.i(ev2);
            }
        } else if (actionMasked == 5) {
            if (this.f47943a == null) {
                Iterator it2 = a13.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((h) next2).n(ev2)) {
                        obj = next2;
                        break;
                    }
                }
                this.f47943a = (h) obj;
            }
            h hVar6 = this.f47943a;
            if (hVar6 != null) {
                hVar6.l(ev2);
            }
        } else if (actionMasked == 6 && (hVar = this.f47943a) != null) {
            hVar.o(ev2);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageInteractiveFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47944b = m.b(new c(25, context, this));
    }
}
