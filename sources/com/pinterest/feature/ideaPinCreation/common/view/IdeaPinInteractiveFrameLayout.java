package com.pinterest.feature.ideaPinCreation.common.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import au0.a;
import fu0.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.j;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/common/view/IdeaPinInteractiveFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes5.dex */
public final class IdeaPinInteractiveFrameLayout extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f46463c = 0;

    /* renamed from: a, reason: collision with root package name */
    public i f46464a;

    /* renamed from: b, reason: collision with root package name */
    public final v f46465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinInteractiveFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46465b = m.b(new a(this, 4));
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
            if (childAt instanceof i) {
                arrayList.add(childAt);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev2) {
        i iVar;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (((j) this.f46465b.getValue()).f102463a.onTouchEvent(ev2)) {
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
                i iVar2 = (i) next;
                if (iVar2.t() && iVar2.n(ev2)) {
                    obj = next;
                    break;
                }
            }
            i iVar3 = (i) obj;
            this.f46464a = iVar3;
            if (iVar3 != null) {
                iVar3.e(ev2);
            }
        } else if (actionMasked == 1) {
            i iVar4 = this.f46464a;
            if (iVar4 != null) {
                iVar4.q(ev2);
            }
            this.f46464a = null;
        } else if (actionMasked == 2) {
            i iVar5 = this.f46464a;
            if (iVar5 != null) {
                iVar5.i(ev2);
            }
        } else if (actionMasked == 5) {
            if (this.f46464a == null) {
                Iterator it2 = a13.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((i) next2).n(ev2)) {
                        obj = next2;
                        break;
                    }
                }
                this.f46464a = (i) obj;
            }
            i iVar6 = this.f46464a;
            if (iVar6 != null) {
                iVar6.l(ev2);
            }
        } else if (actionMasked == 6 && (iVar = this.f46464a) != null) {
            iVar.o(ev2);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinInteractiveFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46465b = m.b(new a(this, 4));
    }
}
