package nj;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;

/* loaded from: classes3.dex */
public final class g implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f90968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f90969b;

    public g(ChipGroup chipGroup) {
        this.f90969b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f90969b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = v0.f102521a;
                view2.setId(View.generateViewId());
            }
            com.google.android.material.internal.a aVar = chipGroup.f32462g;
            Chip chip = (Chip) view2;
            ((Map) aVar.f32696d).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aVar.a(chip);
            }
            chip.f32447i = new u6(aVar, 11);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f90968a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f90969b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            com.google.android.material.internal.a aVar = chipGroup.f32462g;
            Chip chip = (Chip) view2;
            aVar.getClass();
            chip.f32447i = null;
            ((Map) aVar.f32696d).remove(Integer.valueOf(chip.getId()));
            ((Set) aVar.f32697e).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f90968a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
