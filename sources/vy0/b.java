package vy0;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import px0.g;
import rq.t0;
import vq0.h;
import wy0.d;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final ry0.a f126893a;

    public b(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f126893a = listener;
    }

    @Override // vq0.h
    public final void c(n view, Object obj, int i13) {
        uy0.b model = (uy0.b) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        if (view instanceof ty0.a) {
            ty0.a aVar = (ty0.a) view;
            String str = model.f123270m;
            Integer valueOf = Integer.valueOf(i13);
            a aVar2 = (a) aVar;
            aVar2.f126889e = str;
            aVar2.f126891g = model.f123269l;
            aVar2.f126890f = valueOf;
            boolean z13 = model.f123267j;
            aVar2.setSelected(z13);
            if (z13) {
                ImageView imageView = aVar2.f126888d;
                if (imageView == null) {
                    Intrinsics.r("selectedBorderView");
                    throw null;
                }
                imageView.setVisibility(0);
                ImageView imageView2 = aVar2.f126887c;
                if (imageView2 == null) {
                    Intrinsics.r("checkmarkView");
                    throw null;
                }
                imageView2.setVisibility(0);
            } else {
                ImageView imageView3 = aVar2.f126888d;
                if (imageView3 == null) {
                    Intrinsics.r("selectedBorderView");
                    throw null;
                }
                imageView3.setVisibility(8);
                ImageView imageView4 = aVar2.f126887c;
                if (imageView4 == null) {
                    Intrinsics.r("checkmarkView");
                    throw null;
                }
                imageView4.setVisibility(8);
            }
            String text = model.f123268k;
            if (text != null) {
                Intrinsics.checkNotNullParameter(text, "text");
                GestaltText gestaltText = aVar2.f126886b;
                if (gestaltText == null) {
                    Intrinsics.r("textView");
                    throw null;
                }
                a0.p(gestaltText, text);
                aVar2.setContentDescription(text);
            }
            String url = model.f123266i;
            if (url != null) {
                Intrinsics.checkNotNullParameter(url, "url");
                String dominantColor = model.f123265h;
                Intrinsics.checkNotNullParameter(dominantColor, "dominantColor");
                WebImageView webImageView = aVar2.f126885a;
                if (webImageView == null) {
                    Intrinsics.r("imageView");
                    throw null;
                }
                webImageView.V1(url, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(Color.parseColor(dominantColor)), (r18 & 64) != 0 ? null : null, null);
            }
            g onClick = new g(model, aVar, this, 2);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            aVar2.setOnClickListener(new t0(17, onClick));
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        uy0.b model = (uy0.b) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return model.f123268k;
    }
}
