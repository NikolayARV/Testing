package org.example.service.serviceImpl;

import org.example.dao.impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserDaoImpl daoMock;
    @InjectMocks
    private UserServiceImpl out;

    @Test
    public void shouldReturnTrueIfUserExist() {
        when(daoMock.getUserByName("Ivan"))
                .thenReturn("Ivan");
        assertTrue(out.checkUserExist("Ivan"));
        verify(daoMock, times(1)).getUserByName("Ivan");
    }

    @Test
    public void shouldReturnFalseIfUserNotExist() {
        when(daoMock.getUserByName("Petr"))
                .thenReturn(null);
        assertFalse(out.checkUserExist("Petr"));
        verify(daoMock, times(1)).getUserByName("Petr");
    }
}