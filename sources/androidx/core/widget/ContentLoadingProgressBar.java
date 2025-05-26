package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17949c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c f17950a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.widget.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.c] */
    public ContentLoadingProgressBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i13 = 0;
        this.f17950a = new Runnable(this) { // from class: androidx.core.widget.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f17989b;

            {
                this.f17989b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i14 = i13;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f17989b;
                switch (i14) {
                    case 0:
                        int i15 = ContentLoadingProgressBar.f17949c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i16 = ContentLoadingProgressBar.f17949c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f17951b = new Runnable(this) { // from class: androidx.core.widget.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f17989b;

            {
                this.f17989b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i142 = i14;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f17989b;
                switch (i142) {
                    case 0:
                        int i15 = ContentLoadingProgressBar.f17949c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i16 = ContentLoadingProgressBar.f17949c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f17950a);
        removeCallbacks(this.f17951b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f17950a);
        removeCallbacks(this.f17951b);
    }
}
