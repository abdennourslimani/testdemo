package dz.mycompany.testdemo.Configuration;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilCOnfiguration {


            @Bean
            public ModelMapper modelMapper(){
                return new ModelMapper();
            }


}
