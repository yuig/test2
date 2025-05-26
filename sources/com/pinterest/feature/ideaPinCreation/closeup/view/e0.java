package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class e0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f46128a;

    public e0(f0 f0Var) {
        this.f46128a = f0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
        int i14;
        f0 f0Var = this.f46128a;
        if (!z13) {
            IdeaPinVideoSeekBar ideaPinVideoSeekBar = f0Var.a0().f46068a;
            ideaPinVideoSeekBar.setProgress(i13);
            ideaPinVideoSeekBar.f46067b.f46382b = (ideaPinVideoSeekBar.getProgress() * 1.0f) / ideaPinVideoSeekBar.getMax();
            return;
        }
        IdeaPinInteractiveVideoView d03 = f0Var.d0();
        ArrayList arrayList = d03.P;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i14 = -1;
                break;
            } else if (((Number) listIterator.previous()).longValue() <= i13) {
                i14 = listIterator.nextIndex();
                break;
            }
        }
        long longValue = i13 - ((Number) arrayList.get(i14)).longValue();
        a7.v0 v0Var = d03.f18946k;
        if (v0Var != null) {
            v0Var.y(i14, longValue);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f46128a.d0().M(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        IdeaPinInteractiveVideoView d03 = this.f46128a.d0();
        if (d03.N) {
            return;
        }
        d03.play();
    }
}
