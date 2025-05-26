package tt0;

import android.widget.SeekBar;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class r0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBar.OnSeekBarChangeListener f119203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationCameraVideoSegmentsView f119204b;

    public r0(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView) {
        this.f119203a = onSeekBarChangeListener;
        this.f119204b = ideaPinCreationCameraVideoSegmentsView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
        qt0.b bVar;
        int i14;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f119203a;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i13, z13);
        }
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.f119204b;
        rt0.b a13 = ideaPinCreationCameraVideoSegmentsView.a();
        if (a13.f109952d || seekBar == null) {
            return;
        }
        int i15 = (int) a13.i();
        if (!z13) {
            if (i13 < i15 || (bVar = ideaPinCreationCameraVideoSegmentsView.f45933e) == null) {
                return;
            }
            qt0.c cVar = bVar.f105135a;
            cVar.d();
            cVar.g();
            return;
        }
        if (i13 >= i15) {
            seekBar.setProgress(i15);
        }
        if (i13 >= i15) {
            qt0.b bVar2 = ideaPinCreationCameraVideoSegmentsView.f45933e;
            if (bVar2 != null) {
                qt0.c cVar2 = bVar2.f105135a;
                cVar2.d();
                cVar2.g();
                return;
            }
            return;
        }
        int progress = seekBar.getProgress();
        ArrayList arrayList = a13.f109958j;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i14 = -1;
                break;
            } else if (((Number) listIterator.previous()).longValue() <= progress) {
                i14 = listIterator.nextIndex();
                break;
            }
        }
        long longValue = ((Number) arrayList.get(i14)).longValue();
        qt0.b bVar3 = ideaPinCreationCameraVideoSegmentsView.f45933e;
        if (bVar3 != null) {
            long j13 = progress - longValue;
            qt0.c cVar3 = bVar3.f105135a;
            rt0.b bVar4 = cVar3.f105137b;
            boolean z14 = bVar4.f109953e;
            bVar4.f109953e = true;
            bVar4.w(false);
            if (z14 != bVar4.f109953e) {
                bVar4.s(3);
            }
            cVar3.f105136a.x8();
            cVar3.d();
            a7.v0 v0Var = cVar3.f105139d;
            if (v0Var != null) {
                ((a7.h) v0Var).y(i14, j13);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f119203a;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f119203a;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        qt0.b bVar = this.f119204b.f45933e;
        if (bVar != null) {
            qt0.c cVar = bVar.f105135a;
            boolean j13 = cVar.f105137b.j();
            rt0.b bVar2 = cVar.f105137b;
            if (j13 && !cVar.c()) {
                bVar2.y(true);
            }
            boolean z13 = bVar2.f109953e;
            bVar2.f109953e = false;
            if (z13) {
                bVar2.s(3);
            }
            cVar.f();
        }
    }
}
