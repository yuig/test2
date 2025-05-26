package qv0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.api.model.pp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f105218f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f105219a;

    /* renamed from: b, reason: collision with root package name */
    public final List f105220b;

    /* renamed from: c, reason: collision with root package name */
    public final nv0.b f105221c;

    /* renamed from: d, reason: collision with root package name */
    public final pv0.d f105222d;

    /* renamed from: e, reason: collision with root package name */
    public final nv0.l f105223e;

    public y(Context context, ArrayList data, nv0.b actionListener, pv0.d boardStickerListener, nv0.l imageStickerListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        Intrinsics.checkNotNullParameter(boardStickerListener, "boardStickerListener");
        Intrinsics.checkNotNullParameter(imageStickerListener, "imageStickerListener");
        this.f105219a = context;
        this.f105220b = data;
        this.f105221c = actionListener;
        this.f105222d = boardStickerListener;
        this.f105223e = imageStickerListener;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f105220b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return (pp) this.f105220b.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return ((pp) this.f105220b.get(i13)).getInteractiveStickerType();
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        View uVar;
        pp ppVar = (pp) this.f105220b.get(i13);
        int interactiveStickerType = ppVar.getInteractiveStickerType();
        if (interactiveStickerType == a42.l.MENTION.getValue()) {
            uVar = new z(this.f105219a, aq1.c.capsule_rect_teal_green, null, vn1.c.LIGHT, rm1.c.LIGHT, aq1.h.idea_pin_at_mention_sticker);
        } else if (interactiveStickerType == a42.l.PRODUCT_TAG.getValue()) {
            uVar = new z(this.f105219a, aq1.c.capsule_rect_white_always, rm1.q.TAG, vn1.c.DARK, rm1.c.DARK, aq1.h.idea_pin_product_sticker);
        } else if (interactiveStickerType == a42.l.VIRTUAL_TRY_ON.getValue()) {
            uVar = new z(this.f105219a, aq1.c.capsule_rect_orange_gradient, rm1.q.FACE_TRYON, vn1.c.LIGHT, rm1.c.LIGHT, aq1.h.idea_pin_vto_sticker);
        } else {
            int value = a42.l.BOARD_STICKER.getValue();
            Context context = this.f105219a;
            uVar = interactiveStickerType == value ? new u(context, this.f105222d) : interactiveStickerType == a42.l.IMAGE_STICKER.getValue() ? new w(context, this.f105223e) : new View(context);
        }
        uVar.setOnClickListener(new xa0.m(27, this, ppVar));
        return uVar;
    }
}
