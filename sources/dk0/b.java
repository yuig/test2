package dk0;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.ui.q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import bk0.c;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNameSuggestionCell;
import com.pinterest.feature.boardsection.create.view.BoardSectionNameSuggestionRep;
import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import com.pinterest.ui.grid.pin.ImagelessPinView;
import com.pinterest.ui.imageview.ProportionalImageView;
import df.j1;
import f11.e;
import f11.f;
import java.util.ArrayList;
import java.util.List;
import kl0.t;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import l11.m;
import os.n;
import pk.a0;
import vb0.j;
import xo0.s;

/* loaded from: classes5.dex */
public final class b extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55157d;

    /* renamed from: e, reason: collision with root package name */
    public Object f55158e;

    /* renamed from: f, reason: collision with root package name */
    public Object f55159f;

    public b(int i13) {
        this.f55157d = i13;
        if (i13 != 2) {
            this.f55158e = new ArrayList();
        } else {
            this.f55158e = new ArrayList();
            this.f55159f = new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f55157d) {
            case 0:
                return ((List) this.f55158e).size();
            case 1:
                return ((List) this.f55158e).size();
            case 2:
                return Integer.MAX_VALUE;
            default:
                return ((m) ((e) this.f55159f)).J0.size();
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        String str;
        switch (this.f55157d) {
            case 3:
                if (i13 < 0 || i13 >= e()) {
                    str = "";
                } else {
                    str = ((PinnableImage) ((m) ((e) this.f55159f)).J0.get(i13)).f35564a;
                    Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
                }
                return str.hashCode();
            default:
                return -1L;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        switch (this.f55157d) {
            case 3:
                j.f125466a.S(i13 >= 0 && i13 < e(), "Invalid position passed to getItemViewType in BoardSectionPinCarouselAdapter", new Object[0]);
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 viewHolder, int i13) {
        switch (this.f55157d) {
            case 0:
                a viewHolder2 = (a) viewHolder;
                Intrinsics.checkNotNullParameter(viewHolder2, "viewHolder");
                View itemView = viewHolder2.f19717a;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                if (itemView instanceof BoardCreateBoardNameSuggestionCell) {
                    Resources resources = itemView.getResources();
                    c cVar = (c) ((List) this.f55158e).get(i13);
                    BoardCreateBoardNameSuggestionCell boardCreateBoardNameSuggestionCell = (BoardCreateBoardNameSuggestionCell) itemView;
                    String text = cVar.f23148a;
                    Intrinsics.checkNotNullParameter(text, "text");
                    Object value = boardCreateBoardNameSuggestionCell.f45157a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((GestaltSearchGuide) value).b(new gd0.c(text, 25, boardCreateBoardNameSuggestionCell));
                    boardCreateBoardNameSuggestionCell.setOnClickListener(new q(viewHolder2, this, resources, cVar, 7));
                    boardCreateBoardNameSuggestionCell.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                    boardCreateBoardNameSuggestionCell.setContentDescription(resources.getString(x60.e.first_board_create_a11y_board_suggestions_prefix, cVar.f23148a));
                    break;
                }
                break;
            case 1:
                n holder = (n) viewHolder;
                Intrinsics.checkNotNullParameter(holder, "holder");
                String name = (String) ((List) this.f55158e).get(i13);
                BoardSectionNameSuggestionRep boardSectionNameSuggestionRep = (BoardSectionNameSuggestionRep) holder.f97493u;
                boardSectionNameSuggestionRep.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                a0.p(boardSectionNameSuggestionRep.f45373a, name);
                boardSectionNameSuggestionRep.setOnClickListener(new xa0.m(11, this, name));
                break;
            case 2:
                d01.b viewHolder3 = (d01.b) viewHolder;
                Intrinsics.checkNotNullParameter(viewHolder3, "viewHolder");
                int size = ((List) this.f55158e).size();
                ProportionalImageView proportionalImageView = viewHolder3.f53591u;
                if (size <= 0) {
                    if (((List) this.f55159f).size() > 0) {
                        List list = (List) this.f55159f;
                        String imageUrl = (String) list.get(i13 % list.size());
                        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER);
                        viewHolder3.f53591u.V1(imageUrl, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                        break;
                    }
                } else {
                    List list2 = (List) this.f55158e;
                    f30 pin = (f30) list2.get(i13 % list2.size());
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    as1.b a13 = as1.b.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                    sr b13 = bs1.b.b(pin, a13);
                    if (b13 != null) {
                        float doubleValue = (float) b13.k().doubleValue();
                        float doubleValue2 = (float) b13.h().doubleValue();
                        proportionalImageView.f52576J = (doubleValue <= 0.0f || doubleValue2 <= 0.0f) ? 1.0f : doubleValue2 / doubleValue;
                        proportionalImageView.V1(bs1.c.D0(b13), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                if (g(i13) == 1) {
                    f itemView2 = (f) viewHolder;
                    m mVar = (m) ((e) this.f55159f);
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(itemView2, "itemView");
                    j.f125466a.S(i13 >= 0 && i13 < mVar.J0.size(), "bindItemView in CarouselPinCell failed because the position being bound is greater than the number of pinnable images available.", new Object[0]);
                    PinnableImage pinnableImage = (PinnableImage) mVar.J0.get(i13);
                    if (pinnableImage.f35574k == null) {
                        String pinImageUrl = pinnableImage.f35569f;
                        Intrinsics.checkNotNullExpressionValue(pinImageUrl, "getImageUrl(...)");
                        l11.n nVar = (l11.n) itemView2;
                        Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
                        nVar.f81459y.setVisibility(8);
                        nVar.f81458x.V1(pinImageUrl, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : nVar.f81457w, (r18 & 64) != 0 ? null : null, null);
                        break;
                    } else {
                        ImagelessPinView imagelessPin = ImagelessPinView.a(mVar.getContext(), pinnableImage.f35574k, pinnableImage.f35570g, j1.a0(pinnableImage.f35568e).toString(), pinnableImage.f35572i);
                        Intrinsics.checkNotNullExpressionValue(imagelessPin, "instance(...)");
                        l11.n nVar2 = (l11.n) itemView2;
                        Intrinsics.checkNotNullParameter(imagelessPin, "imagelessPin");
                        imagelessPin.f52560i = true;
                        imagelessPin.f52558g = nVar2.f81455u;
                        imagelessPin.f52559h = nVar2.f81456v;
                        FrameLayout frameLayout = nVar2.f81459y;
                        frameLayout.removeAllViews();
                        frameLayout.addView(imagelessPin);
                        frameLayout.setVisibility(0);
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView viewGroup, int i13) {
        int i14 = 6;
        AttributeSet attributeSet = null;
        switch (this.f55157d) {
            case 0:
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                BoardCreateBoardNameSuggestionCell itemView = new BoardCreateBoardNameSuggestionCell(i14, context, attributeSet);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                return new a(itemView);
            case 1:
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Context context2 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                BoardSectionNameSuggestionRep boardSectionNameSuggestionRep = new BoardSectionNameSuggestionRep(6, bs1.c.k0(context2), (AttributeSet) null);
                n nVar = new n(boardSectionNameSuggestionRep);
                nVar.f97493u = boardSectionNameSuggestionRep;
                return nVar;
            case 2:
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Context context3 = viewGroup.getContext();
                ProportionalImageView proportionalImageView = new ProportionalImageView(context3);
                proportionalImageView.setBackgroundDrawable(bs1.c.f0(proportionalImageView, iy1.c.animated_pin_placeholder, null, null, 6));
                Intrinsics.f(context3);
                float V = bs1.c.V(context3, eo1.c.space_200);
                proportionalImageView.g2(V, V, V, V);
                return new d01.b(proportionalImageView);
            default:
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                if (i13 != 1) {
                    return new s(new View(viewGroup.getContext()), 0);
                }
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(z.i((String) this.f55158e, "large", false) ? f02.e.carousel_pin_cell_item_large : f02.e.carousel_pin_cell_item, (ViewGroup) viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                return new l11.n(inflate);
        }
    }

    public b(e dataSource, String str) {
        this.f55157d = 3;
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f55159f = dataSource;
        this.f55158e = str;
        A(true);
    }

    public b(t clickListener) {
        this.f55157d = 1;
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f55159f = clickListener;
        this.f55158e = q0.f80391a;
    }
}
