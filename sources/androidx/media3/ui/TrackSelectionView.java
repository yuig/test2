package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f19007e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f19008a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckedTextView f19009b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19010c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19011d;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        androidx.appcompat.app.c cVar = new androidx.appcompat.app.c(this);
        getResources().getClass();
        new ArrayList();
        this.f19010c = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f19008a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(k0.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(cVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(j0.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f19009b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(k0.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(cVar);
        addView(checkedTextView2);
    }
}
