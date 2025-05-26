package net.quikkly.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.math.BigInteger;
import net.quikkly.android.Quikkly;
import net.quikkly.android.R;
import net.quikkly.core.Skin;

/* loaded from: classes4.dex */
public class RenderTagView extends AppCompatImageView {
    private boolean allowRender;
    private BigInteger data;
    private Pair<String, Bitmap> generatedTag;
    private int height;
    private Skin skin;
    private String template;
    private int width;

    public RenderTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.allowRender = true;
        init();
    }

    private boolean eq(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void init() {
        renderBitmap();
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    private void renderBitmap() {
        Object obj;
        if (this.allowRender) {
            if (this.width <= 0 || this.height <= 0 || TextUtils.isEmpty(this.template) || this.data == null || this.skin == null) {
                this.generatedTag = null;
            } else {
                this.generatedTag = Quikkly.getInstance().generateBitmap(this.template, this.data, this.skin, this.width, this.height);
            }
            Pair<String, Bitmap> pair = this.generatedTag;
            if (pair == null || (obj = pair.second) == null) {
                setImageResource(R.drawable.ic_error_outline_darkred_48dp);
            } else {
                setImageBitmap((Bitmap) obj);
            }
        }
    }

    public BigInteger getData() {
        return this.data;
    }

    public Bitmap getGeneratedBitmap() {
        Pair<String, Bitmap> pair = this.generatedTag;
        if (pair != null) {
            return (Bitmap) pair.second;
        }
        return null;
    }

    public String getGeneratedSvg() {
        Pair<String, Bitmap> pair = this.generatedTag;
        if (pair == null || TextUtils.isEmpty((CharSequence) pair.first)) {
            return null;
        }
        return (String) this.generatedTag.first;
    }

    public Skin getSkin() {
        return this.skin;
    }

    public String getTemplate() {
        return this.template;
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.width = i13;
        this.height = i14;
        renderBitmap();
    }

    public void setAll(String str, BigInteger bigInteger, Skin skin) {
        try {
            this.allowRender = false;
            if ((setTemplate(str) | setData(bigInteger)) || setSkin(skin)) {
                renderBitmap();
            }
        } finally {
            this.allowRender = true;
        }
    }

    public boolean setData(BigInteger bigInteger) {
        if (eq(this.data, bigInteger)) {
            return false;
        }
        this.data = bigInteger;
        renderBitmap();
        return true;
    }

    public boolean setSkin(Skin skin) {
        if (eq(this.skin, skin)) {
            return false;
        }
        this.skin = skin;
        renderBitmap();
        return true;
    }

    public boolean setTemplate(String str) {
        if (eq(this.template, str)) {
            return false;
        }
        this.template = str;
        renderBitmap();
        return true;
    }

    public RenderTagView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.allowRender = true;
        init();
    }

    public RenderTagView(Context context) {
        super(context, null);
        this.allowRender = true;
        init();
    }
}
