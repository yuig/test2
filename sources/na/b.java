package na;

import android.app.Application;
import android.security.keystore.KeyGenParameterSpec;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f90077a;

    /* renamed from: b, reason: collision with root package name */
    public KeyGenParameterSpec f90078b;

    /* renamed from: c, reason: collision with root package name */
    public c f90079c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90080d;

    /* renamed from: e, reason: collision with root package name */
    public int f90081e;

    public b(Application application) {
        application.getApplicationContext();
        this.f90077a = "android-keystore://_androidx_pinterest_security_main_key_";
    }

    public final void a() {
        c cVar = this.f90079c;
        if (cVar == null && this.f90078b == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        if (cVar == c.AES256_GCM) {
            KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f90077a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
            if (this.f90080d) {
                keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f90081e);
            }
            this.f90078b = keySize.build();
        }
        KeyGenParameterSpec keyGenParameterSpec = this.f90078b;
        if (keyGenParameterSpec == null) {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
        int i13 = d.f90082a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(keystoreAlias)) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpec);
                keyGenerator.generateKey();
            } catch (ProviderException e13) {
                throw new GeneralSecurityException(e13.getMessage(), e13);
            }
        }
        keyGenParameterSpec.getKeystoreAlias();
    }

    public final void b(c cVar) {
        if (a.f90076a[cVar.ordinal()] != 1) {
            throw new IllegalArgumentException("Unsupported scheme: " + cVar);
        }
        if (this.f90078b != null) {
            throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
        }
        this.f90079c = cVar;
    }
}
