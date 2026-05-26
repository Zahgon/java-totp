package dev.samstevens.totp.time;

import dev.samstevens.totp.exceptions.TimeProviderException;
import java.time.Instant;

public class SystemTimeProvider implements TimeProvider {

    @Override
    public long getTime() throws TimeProviderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
