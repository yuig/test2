package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final f f16054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16055b;

    public j(Context context) {
        this(context, k.g(context, 0));
    }

    @NonNull
    public k create() {
        f fVar = this.f16054a;
        k kVar = new k(fVar.f16000a, this.f16055b);
        View view = fVar.f16004e;
        i iVar = kVar.f16058f;
        if (view != null) {
            iVar.B = view;
        } else {
            CharSequence charSequence = fVar.f16003d;
            if (charSequence != null) {
                iVar.f16030e = charSequence;
                TextView textView = iVar.f16051z;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = fVar.f16002c;
            if (drawable != null) {
                iVar.f16049x = drawable;
                iVar.f16048w = 0;
                ImageView imageView = iVar.f16050y;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    iVar.f16050y.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = fVar.f16005f;
        if (charSequence2 != null) {
            iVar.d(-1, charSequence2, fVar.f16006g);
        }
        CharSequence charSequence3 = fVar.f16007h;
        if (charSequence3 != null) {
            iVar.d(-2, charSequence3, fVar.f16008i);
        }
        if (fVar.f16010k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) fVar.f16001b.inflate(iVar.F, (ViewGroup) null);
            int i13 = fVar.f16013n ? iVar.G : iVar.H;
            ListAdapter listAdapter = fVar.f16010k;
            if (listAdapter == null) {
                listAdapter = new h(fVar.f16000a, i13, R.id.text1, null);
            }
            iVar.C = listAdapter;
            iVar.D = fVar.f16014o;
            if (fVar.f16011l != null) {
                alertController$RecycleListView.setOnItemClickListener(new e(0, fVar, iVar));
            }
            if (fVar.f16013n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            iVar.f16031f = alertController$RecycleListView;
        }
        View view2 = fVar.f16012m;
        if (view2 != null) {
            iVar.f16032g = view2;
            iVar.f16033h = 0;
            iVar.f16034i = false;
        }
        kVar.setCancelable(true);
        kVar.setCanceledOnTouchOutside(true);
        kVar.setOnCancelListener(null);
        kVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = fVar.f16009j;
        if (onKeyListener != null) {
            kVar.setOnKeyListener(onKeyListener);
        }
        return kVar;
    }

    @NonNull
    public Context getContext() {
        return this.f16054a.f16000a;
    }

    public j setNegativeButton(int i13, DialogInterface.OnClickListener onClickListener) {
        f fVar = this.f16054a;
        fVar.f16007h = fVar.f16000a.getText(i13);
        fVar.f16008i = onClickListener;
        return this;
    }

    public j setPositiveButton(int i13, DialogInterface.OnClickListener onClickListener) {
        f fVar = this.f16054a;
        fVar.f16005f = fVar.f16000a.getText(i13);
        fVar.f16006g = onClickListener;
        return this;
    }

    public j setTitle(CharSequence charSequence) {
        this.f16054a.f16003d = charSequence;
        return this;
    }

    public j setView(View view) {
        this.f16054a.f16012m = view;
        return this;
    }

    public j(@NonNull Context context, int i13) {
        this.f16054a = new f(new ContextThemeWrapper(context, k.g(context, i13)));
        this.f16055b = i13;
    }
}
