package com.pinterest.feature.conversation.view;

import a.a;
import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.activity.pin.view.PinCloseUpWebImageView;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.um;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/conversation/view/GifReactionView;", "Lcom/pinterest/activity/pin/view/PinCloseUpWebImageView;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GifReactionView extends PinCloseUpWebImageView implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifReactionView(@NotNull Context context, AttributeSet attributeSet) {
        super(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.activity.pin.view.PinCloseUpWebImageView
    public final void a(um umVar) {
        gn m43 = umVar.f42584a.m4();
        String f13 = m43 != null ? m43.f() : null;
        if (f13 == null) {
            f13 = "";
        }
        this.f34985c = a.k("<!DOCTYPE html><html style='background=white;'><head><style type='text/css'>.reset{padding:0;margin:0;border:0;}</style></head><body width='100%' height='100%' align='center' class='reset'><img class='reset' src='", f13, "'style='width:nullpx;height:nullpx;object-fit:cover' onerror='this.src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAALEgAACxIB0t1+/AAAABx0RVh0U29mdHdhcmUAQWRvYmUgRmlyZXdvcmtzIENTNui8sowAAAAUdEVYdENyZWF0aW9uIFRpbWUAOC82LzEy6HMsjwAABOxJREFUeJztnGGL2zgQhh+HhjRhCbcspcuVUu7//6ijFI7tLSVc2NttCJfcB1k915mRNRqndjk9ELJNbWnyWhqPRuM05/OZSjmLqQ342akCOqkCOqkCOqkCOqkCOqkCOqkCOqkCOqkCOqkCOnllObhpmmvYsAHWwApYtu8aB+DYvr8Az2MaUpIXaCwnjSjgDbBt3708Afv23cXcBVwAt+3rGq7jBOza16mkgTkLeMf1hOsThfxiPXGOAm6AtwTf9qM5Ap8x+Mm5CfiGMOqGOBG+5Avh5vAVeQougNeEm8yacHFyRvQOeMw4bjYCLoD3pO+mEJx+vAGUEm9EQzejA/CJAd84BwGXwK+kxdsT/NMxu+NhlgQ/u00ccwD+SPU7tYBL4AP6tDoQptKosVuPDcF1aBfwBHxEEXFKAYembbYfGomU/1Wn85QCfkAX7wGfnytlC9wr/3cgjMTvKBFwjLhMmzJxukwhHm2/H5FvHCuC3W68Am7Qp8onwpWekjhdJW4J9rvwCvhW+fyB6cWLHAj2SGj2Z+MR8A55hbFjummrsSfY1SeGP8WUChgTA31iqDJHHpFnhWuNXnqi1ulcxYtI9mmDIQuPgH32XDdIHoNnZPdSLKApI91ygyx8bvpoRfA7N4QQ4wn4E1sOL/quuAa2tPGFyyXfom3LnJQtGYHSevOJvLXtkrBiiV980bb33tD/ghC4b9u/YxupZWSXI7JQqXV00hgrUuYj98q9UfpckT+N7pQ2loY2JHuLthesAkqB54n8sCUVuA6lvyKvC9vvskeY7k3TmANrq4Br4TPLjSM1zf8x2uJtQ7Jb+n5JrAJKo+TFcH5qqv+d2cZfhe33kezOnQXfsAoorTwsS7adcvyO/JG8R3YZ2ucakh3mvRtrGCNdoa+G82OGZtu2daJsg/yBMNqiPSVtSHabR2BJHNinZA92jLVy3FMppWjvuE+tjXFSBXQyxhS+Ft2YbNC/ddPxVyqCEpmTgHF/d418NzwSbhZe3zcqYwi4wOeQbwhLvKEQYtm+tgQxH/EJOYr7sjYixU6ppdVQ3/eEjXhr/BU38O8pF0Ky27wNYe1cWoqZYyf+20cuyoB0iJmcEhElu83VEtYpfOAya7FG3m9I8Q5d+Jhu6rqFmK+TRuqqbU/bfdOQ1r3mEWgVUFo/WjMYd+jGp0o/HtFLN9ZN09ydz2dLTaBkt2VdD9iHvvTlYkIzBy1nFzfBh8KVZ/TN+tumaXJ9aUzGfsf5fDZvSZT4Dk8y8hehzyf0fVuNuBbusmjbz8GTFL7o1Ip09TX/JB3Xp3QnTzov50IuleOK1uelI1CK+4Y2qONjDF32lNcJHrn80sumaYaiAsnOuLllpjSGku66W+wpe++KQjo/JeAG2V9bo4hveASURmGq4kma4t59ZOn8lCuR7ItV/UWULuVip/3pEMvGJP905PILe3NysUC934+EVoZX/FwJ+Assf0O+4lMVVWpoxZZH4Pf4jykKLD8rn99TtsS7Biv0SlXN/my8Aj6j+4+cRx2uzQq96sGykaUyRkpHKxvrlmBMQarcY7QyvFql36E+J/ITPycSqU8qJQ+uz8pdUJ/W7DA3AaE+L9w7uD6xfkH9zYQOcxewS/3VjhH5//xuTOWSWp3lpAropAropAropAropAropAropAropAropAro5F98M6PT1IgmawAAAABJRU5ErkJggg==\";this.style.width=\"40px\";this.style.height=\"40px\";this.style.position=\"absolute\";this.style.margin=\"-20px 0 0 -20px\";this.style.left=\"50%\";this.style.top=\"50%\";' /></body></html>");
        super.a(umVar);
    }
}
