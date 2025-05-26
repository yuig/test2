package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.airbnb.lottie.k;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import f0.h;
import ko.a;
import ko.d;
import ko.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lo.c;
import mo.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/ui/views/YouTubePlayerSeekBar;", "Landroid/widget/LinearLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lmo/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class YouTubePlayerSeekBar extends LinearLayout implements SeekBar.OnSeekBarChangeListener, b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f34790h = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34791a;

    /* renamed from: b, reason: collision with root package name */
    public int f34792b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34793c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34794d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f34795e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f34796f;

    /* renamed from: g, reason: collision with root package name */
    public final SeekBar f34797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerSeekBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34792b = -1;
        this.f34794d = true;
        TextView textView = new TextView(context);
        this.f34795e = textView;
        TextView textView2 = new TextView(context);
        this.f34796f = textView2;
        SeekBar seekBar = new SeekBar(context);
        this.f34797g = seekBar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.YouTubePlayerSeekBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…uTubePlayerSeekBar, 0, 0)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.YouTubePlayerSeekBar_fontSize, getResources().getDimensionPixelSize(ko.b.ayp_12sp));
        int i13 = e.YouTubePlayerSeekBar_color;
        int i14 = a.ayp_red;
        Object obj = d5.a.f53679a;
        int color = obtainStyledAttributes.getColor(i13, context.getColor(i14));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(ko.b.ayp_8dp);
        textView.setText(getResources().getString(d.ayp_null_time));
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize2);
        textView.setTextColor(context.getColor(R.color.white));
        textView.setGravity(16);
        textView2.setText(getResources().getString(d.ayp_null_time));
        textView2.setPadding(0, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        textView2.setTextColor(context.getColor(R.color.white));
        textView2.setGravity(16);
        float f13 = dimensionPixelSize;
        textView.setTextSize(0, f13);
        textView2.setTextSize(0, f13);
        int i15 = dimensionPixelSize2 * 2;
        seekBar.setPadding(i15, dimensionPixelSize2, i15, dimensionPixelSize2);
        seekBar.getThumb().setTint(color);
        seekBar.getProgressDrawable().setTint(color);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        addView(seekBar, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        setGravity(16);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // mo.b
    public final void a(WebViewYouTubePlayer youTubePlayer, String videoId) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
    }

    @Override // mo.b
    public final void b(WebViewYouTubePlayer youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public final void c(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        boolean z13 = this.f34794d;
        SeekBar seekBar = this.f34797g;
        if (z13) {
            seekBar.setSecondaryProgress((int) (f13 * seekBar.getMax()));
        } else {
            seekBar.setSecondaryProgress(0);
        }
    }

    @Override // mo.b
    public final void d(WebViewYouTubePlayer youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public final void e(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        this.f34796f.setText(h.A(f13));
        this.f34797g.setMax((int) f13);
    }

    @Override // mo.b
    public final void f(WebViewYouTubePlayer youTubePlayer, c error) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // mo.b
    public final void g(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        if (this.f34791a) {
            return;
        }
        if (this.f34792b <= 0 || Intrinsics.d(h.A(f13), h.A(this.f34792b))) {
            this.f34792b = -1;
            this.f34797g.setProgress((int) f13);
        }
    }

    @Override // mo.b
    public final void h(WebViewYouTubePlayer youTubePlayer, lo.d state) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f34792b = -1;
        int i13 = ro.a.f108933a[state.ordinal()];
        if (i13 == 1) {
            this.f34793c = false;
            return;
        }
        if (i13 == 2) {
            this.f34793c = false;
            return;
        }
        if (i13 == 3) {
            this.f34793c = true;
        } else {
            if (i13 != 4) {
                return;
            }
            SeekBar seekBar = this.f34797g;
            seekBar.setProgress(0);
            seekBar.setMax(0);
            this.f34796f.post(new k(this, 21));
        }
    }

    @Override // mo.b
    public final void i(WebViewYouTubePlayer youTubePlayer, lo.b playbackRate) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(playbackRate, "playbackRate");
    }

    @Override // mo.b
    public final void j(WebViewYouTubePlayer youTubePlayer, lo.a playbackQuality) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(playbackQuality, "playbackQuality");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        this.f34795e.setText(h.A(i13));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        this.f34791a = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        if (this.f34793c) {
            this.f34792b = seekBar.getProgress();
        }
        this.f34791a = false;
    }
}
