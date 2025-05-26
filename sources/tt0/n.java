package tt0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.ideaPinCreation.camera.view.CenterCropCameraTextureView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraView;
import kh2.g3;
import so.jb;

/* loaded from: classes5.dex */
public abstract class n extends CenterCropCameraTextureView implements af2.c {

    /* renamed from: c, reason: collision with root package name */
    public ye2.o f119193c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f119194d;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f119193c == null) {
            this.f119193c = new ye2.o(this);
        }
        return this.f119193c;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f119193c == null) {
            this.f119193c = new ye2.o(this);
        }
        return this.f119193c.generatedComponent();
    }

    public final void m() {
        if (this.f119194d) {
            return;
        }
        this.f119194d = true;
        g3.y1((IdeaPinCreationCameraView) this, (lb0.r) ((jb) ((w0) generatedComponent())).f113483a.f113622c1.get());
    }

    public n(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        m();
    }
}
