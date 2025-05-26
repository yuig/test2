package dp;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import ap.o;
import com.pinterest.activity.conversation.view.PersonRightImageListCell;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import dr.k;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import rl1.r;
import u20.d;
import xc0.f;
import z70.m;

/* loaded from: classes3.dex */
public final class c extends k {
    public final /* synthetic */ int I = 1;

    /* renamed from: J, reason: collision with root package name */
    public final Object f56031J;
    public final Object K;
    public Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, o uploadContactsUtil, m chromeTabHelper, lu1.b baseActivityHelper) {
        super(context, uploadContactsUtil);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f56031J = chromeTabHelper;
        this.K = baseActivityHelper;
    }

    @Override // dr.k
    public final void c() {
        switch (this.I) {
            case 0:
                break;
            default:
                super.c();
                break;
        }
    }

    @Override // dr.k
    public final int e() {
        switch (this.I) {
            case 0:
                return f.list_cell_person_imageview;
            default:
                return this.f56209x;
        }
    }

    @Override // dr.k
    public final void g(String str) {
        switch (this.I) {
            case 0:
                if (!a0.s0(str)) {
                    super.g(str);
                    break;
                } else {
                    this.f56201p = str;
                    new b(this).b();
                    break;
                }
            default:
                super.g(str);
                break;
        }
    }

    @Override // dr.k, android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        switch (this.I) {
            case 0:
                this.E = r.LG;
                final PersonRightImageListCell personRightImageListCell = (PersonRightImageListCell) super.getView(i13, view, viewGroup);
                final boolean j13 = j((TypeAheadItem) this.f56200o.get(i13));
                personRightImageListCell.f34889h.s(new Function1() { // from class: lp.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        bm1.m displayState = (bm1.m) obj;
                        int i14 = PersonRightImageListCell.f34888i;
                        PersonRightImageListCell personRightImageListCell2 = PersonRightImageListCell.this;
                        personRightImageListCell2.getClass();
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        bm1.o oVar = displayState.f23507a;
                        boolean z13 = j13;
                        bm1.n selectedState = z13 ? bm1.n.SELECTED : bm1.n.UNSELECTED;
                        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                        bm1.b buttonType = new bm1.b(z13 ? bs1.c.p2(personRightImageListCell2.getContext().getString(x0.added)) : bs1.c.p2(personRightImageListCell2.getContext().getString(x0.add)), null, false);
                        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                        return new bm1.m(oVar, selectedState, buttonType, displayState.f23510d, displayState.f23511e, displayState.f23512f, displayState.f23513g);
                    }
                });
                return personRightImageListCell;
            default:
                return super.getView(i13, view, viewGroup);
        }
    }

    public final boolean j(TypeAheadItem typeAheadItem) {
        for (TypeAheadItem typeAheadItem2 : (Set) this.f56031J) {
            if (typeAheadItem2.A() != null && typeAheadItem2.A().equals(typeAheadItem.A())) {
                return true;
            }
            if (typeAheadItem2.k() != null && typeAheadItem2.k().equals(typeAheadItem.k())) {
                return true;
            }
        }
        return false;
    }

    public final void k(TypeAheadItem typeAheadItem) {
        ((Set) this.f56031J).add(typeAheadItem);
    }

    public c(Context context, d dVar, o oVar) {
        super(context, oVar);
        this.f56031J = new HashSet();
        this.f56202q = 50;
        this.K = new Handler();
        this.L = dVar;
        g("");
    }
}
